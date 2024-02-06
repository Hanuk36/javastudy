package com.ict.day06;

public class Ex04 {

	public static void main(String[] args) {
		
		//break 와 break label
		//break : 현재 위치의 블록을 탈출
		//break label : 레이블이 지정한 블록을 탈출
		
		//레이블지정 : 반복문 앞에 "이름" 붙히면 된다.
		
		//1~10 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1~10 출력 (break)
		for (int i = 1; i < 11; i++) {
			if(i == 6)break; //for 문 자체를 빠짐
			System.out.print("*" + i + " ");
		}
		System.out.println();
		
		//1~10 출력 (break label)
		//반복문 앞에 label 이름뒤 : 붙힌다.
		//for 문에는 break lable을 붙일 이유가 없다.
		exit:for (int i = 1; i < 11; i++) {
			if(i == 6)break exit; //결과가 똑같아서 구지 레이블을 할필요 없음
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("다중 for문 break label 사용하기");
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("1------1");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2) break; //2만 안찍음
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("*********");
		
		exit:for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2) break exit; // 1만 찍고 레이블이 있는 for 문을 다 나간다.
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("2-------2");	
	}
}