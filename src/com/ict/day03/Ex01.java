package com.ict.day03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//증감연산자: 1 증가 또는 1 감소 하는 연산자
		//++(--) 변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소) 하고 나머지를 실행
		//변수 ++(--) : 현재 변수를 가지고 실행 한 후 그 명령 구문히 끝날때 1을 증가(감소)한다.
		
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1 + 4);
		System.out.println(su2++ + 4);
		System.out.println(su2);
		System.out.println(su2++); //첫번째 su2 => 값 10
		System.out.println(su2++); //두번째 su2 => 값 11	
	}
}
