package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//List<Ex01_VO> list = Ex01_DAO.getList();
		//Ex01_Main test =  new Ex01_Main();
		//test.prn2(list);

		// 전체 테이블 보기. DB를 처리하고 싶으면 DAO 로 간다. 여러줄을 받기때문에 반환형이 List<Ex01_VO> 이다.
		List<Ex01_VO> list = Ex01_DAO.getList();
		prn(list);
		System.out.println();
		
		System.out.println("선택하세요");
		System.out.println("1.members 테이블에 특정 데이터 보기 ");
		System.out.println("2.members테이블에 데이터 삽입 ");
		System.out.println("3.members테이블에 데이터 삭제 ");
		System.out.println("4.members테이블에 데이터 수정 ");
		System.out.println("5.members테이블에 로그인 하기 ");
		System.out.println(">>>>>>>>>>>>>>  ");

		int menu = scan.nextInt();
		switch (menu) {
		case 1:
			System.out.print("검색할 idx : ");
			String idx = scan.next();   // mapper 에 들어가는건 다 String 이다.
			Ex01_VO vo = Ex01_DAO.getOne(idx);
			prn(vo);
			break;
			
		case 2:
			System.out.println("삽입할 정보를 입력하세요");

			System.out.println("삽입 idx:");
			String idx2 = scan.next();

			System.out.println("삽입 id:");
			String id = scan.next();

			System.out.println("삽입 password:");
			String pw = scan.next();

			System.out.println("삽입 username:");
			String username = scan.next();

			System.out.println("삽입 age:");
			String age = scan.next();
			
			//날짜는 선생님이 안한다.
			//System.out.println("삽입 regdate:");
			//String regdate = scan.next();
			
			//날짜는 오늘 날짜로
			
			//인자가 여러개 있으면 무조건 한개로 만든다.
			Ex01_VO vo12 = new Ex01_VO();
			vo12.setIdx(idx2);
			vo12.setId(id);
			vo12.setPw(pw);
			vo12.setUsername(username);
			vo12.setAge(age);
			int res = Ex01_DAO.getInsert(vo12);
			if(res > 0) {
				//삽입성공할 경우 전체 테이블을 보여준다.
				List<Ex01_VO> list2 = Ex01_DAO.getList();
				prn(list2);
			}else {
				System.out.println("삽입실패");
			}
		
			
			//int result = Ex01_DAO.getIns(new Ex01_VO(idx2, id, pw, username, age, regdate));
			//if (result > 0) {
			//	List<Ex01_VO> list2 = Ex01_DAO.getList();
			//	prn(list2);
			//}
			break;
			
		case 3:
			//파라미터가 하나 일때 vo 사용해서 처리
			System.out.println("삭제할 idx : ");
			String idx3 = scan.next();
			
			Ex01_VO vo3 = new Ex01_VO();
			vo3.setIdx(idx3);
			
			int result2 = Ex01_DAO.getDelete(vo3);
			if (result2 > 0) {
				List<Ex01_VO> list3 = Ex01_DAO.getList();
				prn(list3);
			} else {
				System.out.println("삭제실패");
			}
			break;
			
			//한개일때: String
//			System.out.println("삭제할 idx : ");
//			String idx3 = scan.next();
//			int result2 = Ex01_DAO.getDelete(idx3);
//			if (result2 > 0) {
//				List<Ex01_VO> list3 = Ex01_DAO.getList();
//				prn(list3);
//			} else {
//				System.out.println("삭제실패");
//			}
//			break;
			
		case 4:
			//이름과 나이만 바꿈
			System.out.println("수정 정보를 입력하세요");

			System.out.println("수정할 idx:");
			String idx4 = scan.next();

			//System.out.println("수정 id:");
			//String id4 = scan.next();

			//System.out.println("수정 password:");
			//String pw4 = scan.next();

			System.out.println("수정 username:");
			String username4 = scan.next();

			System.out.println("수정 age:");
			String age4 = scan.next();

			//System.out.println("수정 regdate:");
			//String regdate4 = scan.next();

//			int result4 = Ex01_DAO.getUp(new Ex01_VO(idx4, id4, pw4, username4, age4, regdate4));
//			if (result4 > 0) {
//				List<Ex01_VO> list4 = Ex01_DAO.getList();
//				prn(list4);
//			} else {
//				System.out.println("수정실패");
//			}
			
			Ex01_VO vo4 = new Ex01_VO();
			vo4.setIdx(idx4);
			vo4.setUsername(username4);
			vo4.setAge(age4);
			
			int result4 = Ex01_DAO.getUpdate(vo4);
			if(result4 > 0) {
				List<Ex01_VO> list4 = Ex01_DAO.getList();
				prn(list4);
			}else {
				System.out.println("수정실패");
			}
			break;
			
		//로그인
		case 5:
			System.out.print("id : ");
			String id2 = scan.next();
			
			System.out.print("pw : ");
			String pw2 = scan.next();
			
			Ex01_VO vo5 = new Ex01_VO();
			vo5.setId(id2);
			vo5.setPw(pw2);
			
			Ex01_VO vo6 = Ex01_DAO.getLogin(vo5);
			if(vo6 != null) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			break;
		}
	}

	public static void prn(List<Ex01_VO> list) {
		System.out.println("IDX\tID\tPW\tUSERNAME\tAGE\tREGDATE");
		for (Ex01_VO k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getUsername() + "\t");
			System.out.print(k.getAge() + "\t");
			System.out.print(k.getRegdate().substring(0,10) + "\n");
		}
	}

	public static void prn(Ex01_VO vo) {
		System.out.println("IDX\tID\tPW\tUSERNAME\tAGE\tREGDATE");
		System.out.print(vo.getIdx() + "\t");
		System.out.print(vo.getId() + "\t");
		System.out.print(vo.getPw() + "\t");
		System.out.print(vo.getUsername() + "\t");
		System.out.print(vo.getAge() + "\t");
		System.out.print(vo.getRegdate().substring(0,10) + "\n");
	}
}