package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ict.mybatis2.Ex01_DBService;

//실제로 DB 처리하는 DAO
public class Ex01_DAO {
	
		private static SqlSession ss;
		//static 은 아무거 접근이 가능하기 때문에, 먼저것 실행 끌날때 까지는 다음것은 실행하지 말하는 뜻.
		private synchronized static SqlSession getSession() {
			if(ss == null) {
				ss = Ex01_DBService.getFactory().openSession();
			}
			return ss;
		}
		// DB 처리하는 메서드들
		// 전체 테이블 보기
		// Select 는 반드시 resultTyp 이 있다.
		public static List<Ex01_VO> getList(){
			List<Ex01_VO> list = null;
			list= getSession().selectList("members.getSelectAll");
			return list;
		}
		
		// idx 를 받아서 특정 데이터 보기
		// getSession() <= 너 DB 가라는 뜻
		// Select 는 반드시 resultTyp 이 있다.
		// parameterType => String
		// 결과를 mapper resultTpye 에 넣고, 여기로 와서 vo에 넣고, 다시 메인으로 간다.
		public static Ex01_VO getOne(String idx) {
			Ex01_VO vo = null;
			vo = getSession().selectOne("members.getSelectOne", idx);
			return vo;
		}
		
		//삽입하기
		//insert 는 무조건 int 로 값을 받는다.
		//resultTpye 이 없다. 파라미터값이 없을수가 없어서 parameterType 을 쓴다.
		//vo2 의 타입은 Ex01_VO 다. 그래서 parameterType 도 Ex01_VO 다.
		//mapper 에 id 값을 insert 해도 되고 getInsert 해줘도 되고, 이름은 내 마음이다.
		
		public static int getInsert(Ex01_VO vo2) {
			int result = 0;
			result = getSession().insert("members.insert", vo2);
			if(result > 0) {
				ss.commit();
			}
			return result;
		}
		
		//삭제1 - String
		//이경우 parameterType 을 String 으로 줘야 한다.
		public static int getDelete(String idx) {
			int result = 0;
			result = getSession().delete("members.getDelete", idx);
			if(result > 0) {
				ss.commit();
			}
			return result;
		}
		
		//삭제2 - VO
		public static int getDelete(Ex01_VO vo3) {
			int result = 0;
			result = getSession().delete("members.getDelete2", vo3);
			if(result > 0) {
				ss.commit();
			}
			return result;
		}
		
		//수정
		public static int getUpdate(Ex01_VO vo4) {
			int result = 0;
			result = getSession().update("members.update", vo4);
			if(result > 0) {
				ss.commit();
			}
			return result;
		}
		
		//로그인
		public static Ex01_VO getLogin(Ex01_VO vo5) {
			Ex01_VO vo = null;
			vo = getSession().selectOne("members.login", vo5);
			
			// 아이디가 없으면 null이 되므로 return null;
			if(vo != null) {
				// pw를 얻어내자 (db에 암호화가 되어있다.)
				String pw = vo.getPw();
				
				// 우리가 입력한 pw 를 암호화 하자 (나중에) 
				// String s_pw = vo5.getPw().암호화 메서드 사용
				
				// db에서 꺼낸 pw와 암호화된 pw를 비교하자 (나중에)
				// 이것이 true 성공 , false이면 실패
				boolean res = false;
				
				if(res) {
					return vo;
				}else {
					return null;
				}
			}else {
				return null;
			}
		}
		

		
		
		
		
		
/*
이 코드를 한번보면, InputStream 타입의 inputStream 변수에 
xml 설정 파일을 담고있는 resource를 getResourceAsStream하고 
그 inputStream으로, sqlSessionFactory를 빌드 하고 있다.

만들어진 sqlSessionFactory로 openSession하여 
SqlSession 객체를 생성 했다.

SqlSessionFactory는 말 그대로 SqlSession 인스턴스를 만들 수 있다. 
SqlSession은 데이터베이스에 대해 SQL 명령어를 실행하기 위해 필요한 모든 메서드를 가지고 있다.	
*/	
		
		
		
		
		
		
	
}
