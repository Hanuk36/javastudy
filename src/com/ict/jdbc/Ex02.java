package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// 1.java 에서 오라클에 접속할수 있도록 도와 주는 클래스
		Connection conn = null;
		// 2.SQL 구문 작성
		Statement stmt = null;
		// 3. 결과 저장
		ResultSet rs = null;
		int result = 0;

		try {
			// 4. jdbc 드라이버로딩 : 오라클, MySQL, mariaDB 다 다르다. / jdbc 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); // OracleDriver <=클래스 이름

			// 5. 오라클과 연결 하기 위한 정보 / 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			// 6.오라클에 연결하기 / 접속
			conn = DriverManager.getConnection(url, user, password);

			// 7. sql 작성
			//String sql = "select * from book";
			String sql = "select * from book where bookname like '축구%'";

			// 8. sql 을 보내기 위해 구분을 만듬. /sql 를 보내기 위해 구문 만듬
			stmt = conn.createStatement();

			// 9. 구문을 보내서 결과 받기
			// 9-1. select 문인 경우
			rs = stmt.executeQuery(sql);

			// 9-2. insert, update, delete 인경우
			// result = stmt.executeUpdate(sql);
			// re.getXXX(index => 1부터시작. 0아님)
			// 여기서는 인텍스로 안받고 컬럼이름으로 받았음
			while (rs.next()) {
				System.out.print(rs.getInt("BOOKID") + "\t");
				System.out.print(rs.getString("BOOKNAME") + "\t");
				System.out.print(rs.getString("PUBLISHER") + "\t");
				System.out.print(rs.getInt("PRICE") + "\n");
			}

		} catch (Exception e) {

		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
