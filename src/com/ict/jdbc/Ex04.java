package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {

	public static void main(String[] args) {
		//customer 의 이강인 삭제하기
		//오라클에 접속을 위한 초기값들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 4. jdbc 드라이버로딩 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결 하기 위한 정보 / 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			// 6.오라클에 연결하기 / 접속
			conn = DriverManager.getConnection(url, user, password);
			
			//7. sql 작성
			String sql = "delete from customer where name='이강인'";
			
			// 8. sql 을 보내기 위해 구분을 만듬. /sql 를 보내기 위해 구문 만듬
			stmt = conn.createStatement();
			
			// 9. 구문을 보내서 결과 받기
			result = stmt.executeUpdate(sql);   /////// 여기서 주의~~~~~~~
			//삭제 성공하면 result=1 이다.
			if(result > 0) {
				System.out.println("삭제성공");
				//성공헸을때 select 문을 이용해서 삽입된 내용을 보자
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}else {
				System.out.println("삭제 실패");
			}
	
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
