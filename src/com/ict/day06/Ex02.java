package com.ict.day06;

public class Ex02 {

	public static void main(String[] args) {
		
		//break 와 continue
		//break: 현재 위치의 블록(for, while, switch) 을 탈출할때 사용하는 예약어
		//continue: continue 문 이하 수행문을 포기하고 다음회차로 진행하는 예약어
		//          for 문인 경우는 증감식으로 이동하고, while 문인 경우는 조건식으로 이동
		//          보통 if 문과 함께 사용한다.
		
		//1~10 까지 출력 사용
		for (int i = 1; i < 11; i++) {
			
			// 이스케이프문자(제어문자)
			// \n ==> 줄바꿈
			// \t ==> 탭
			// \' => '
			// \" => "
			
			System.out.print(i + "  ");
		}
		System.out.println();
		
		
		
		
		//1~10 까지 출력 6에서 break 사용
		for (int i = 1; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6) break;
		}
		System.out.println();
		
		
		
		
		//1~10 까지 출력 6에서 continue 사용
		for (int i = 1; i < 11; i++) {
			if(i == 6) continue;        // 6만 빠짐
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6) continue;        // 의미없음
		}
		System.out.println();
		
		
		
		//1~10까지 짝수만 출력하자 (continue 이용)
		for (int i = 1; i < 11; i++) {
			if(i % 2 == 1) continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
}