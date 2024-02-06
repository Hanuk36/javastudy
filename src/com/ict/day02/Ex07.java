package com.ict.day02;

public class Ex07 {
	public static void main(String[] args) {
		//String: 문자열을 처리하기 위한 클래스이다.
		//        기본자료형은 아니다. 참조자료형(클래스 자료형으로 사용)이다.
		//        기본 자료형과 같은 사용법이다.
		//        데이타에는 반드시 "내용"(쌍따옴표) 사용
		//String 이름 = "내용";
		
		// + 연산자를 사용할수 있다.
		// 실제로 더하는 것이 아니라 문자열과 문자열을 연결하는 역활을 한다.
		// + 연산을 하면 무조건 결과는 문자열(String)이다.
		
		String s1 = "Hello";
		System.out.println(s1);
		
		//String s2 = 10; //오류
		//String s3 = 3.14; //오류
		//String s4 = 'a'; //오류
		
		String s5 = "a";
		System.out.println(s5);
		
		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1 + 100); // + 의미는 연결시켜주는 더하기
		System.out.println(k2 + 100); // + 의미는 숫자끼리 계산하는 더하기
		
		//문자열에 + 연산자를 사용하면 무조건 결과는 String 이다.
		//int k3 = 105 + "105"; //오류 String 은 크고작다의 개념이 없다. 이것은 String 에 저장해야한다.
		
		String k4 = 105 + "105";
		System.out.println(k4);
		
		int su1 = 20;
		int su2 = 4;
		System.out.println("합계: " + su1 + su2); //문자열의 합이 된다.
		System.out.println("합계: " + (su1 + su2)); //1. 숫자의 합이 먼저 2.그 다음에 문자열
	}
}
