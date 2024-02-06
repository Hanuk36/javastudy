package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
	
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;   // <==이 부분이 바귄것이다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("검색번호 받기:");
			int custid = scan.nextInt();
			// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver <=클래스 이름

			// 5. 오라클과 연결 하기 위한 정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			// 6.오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);

			
			// 7. sql 작성
			// String sql = "select * from customer";
			// ? : 동작바인딩 변수라고 부른다 => 지금은 값을 모르고 실행할때 값을 알 수 있다.
			String sql = "select * from customer where custid = ?";

			
			
			
			
			
			///////여기서부터 달라진다////////
			
			// 8. sql 을 보내기 위해 구분을 만듬.
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql); // <== sql 이 들어가 있다.
			
			// ? 를 처리하자.
			pstmt.setInt(1, custid);
			
			
			// 9. 보내서 결과 받기
			// 9-1. select 문인 경우
			//rs = stmt.executeQuery(sql);
			rs  = pstmt.executeQuery();
			
			
			
			
			

			// 9-2. insert, update, delete 인경우
			// result = stmt.executeUpdate(sql);
			// re.getXXX(index => 1부터시작. 0아님)
			
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}