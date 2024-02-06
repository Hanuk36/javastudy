package com.ict.jdbc;

import java.util.Scanner;

public class Ex11_Main {
	public static void main(String[] args) {
		//전체보기 할꺼냐? 검색해서 custid 받아서 하나만 볼꺼야? 물어보는 스케너
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체 데이터 보기");
		System.out.println("2. customer 테이블 선택 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.println(">>>>>>>>>>>>>>  ");
		
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1:
			Ex11_DAO.getInstance().getSelectAll(); //Ex11_DAO.getInstance() <= 자체가 스텍틱
			break;
		case 2:
			System.out.println("검색할 custid: ");
			int custid = scan.nextInt();
			Ex11_DAO.getInstance().getSelectOne(custid);
			break;
			
		case 3:
			System.out.println("삽입 정보를 입력하세요");
			System.out.println("번호: ");
			int custid2 = scan.nextInt();
			
			System.out.println("이름: ");
			String name = scan.next();
			
			System.out.println("주소: ");
			String address = scan.next();
			
			System.out.println("전화번호: ");
			String phone = scan.next();
			
			int result = Ex11_DAO.getInstance().getInsert(custid2,name,address,phone);
			//성공하면 전체보기
			System.out.println(result);
			if(result > 0) {
				Ex11_DAO.getInstance().getSelectAll();
			}
			break;
			
		case 4:
			System.out.println("삭제할 custid: ");
			int custid3 = scan.nextInt();
			
			Ex11_DAO.getInstance().getDelete(custid3);
			break;
			
		case 5:
			System.out.println("수정 정보를 입력하세요");
			System.out.println("번호: ");
			int custid4 = scan.nextInt();
			
			System.out.println("이름: ");
			String name2 = scan.next();
			
			System.out.println("주소: ");
			String address2 = scan.next();
			
			System.out.println("전화번호: ");
			String phone2 = scan.next();
			
			Ex11_DAO.getInstance().getUpdate(custid4,name2,address2,phone2);
			break;
		}
	}
}
//DAO 는 무조건 DB 처리하는 담당