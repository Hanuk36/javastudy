package com.ict.day03;

public class Ex02 {
	public static void main(String[] args) {
		
		//비교연산자 : > , < , >= , <= , ==(같다) , !=(다르다, 같지않다)
		//비교연산자를 사용할 수 있는 기본 자료형 : 문자형, 정수형, 실수형
		//비교연산 결과는 무조건 논리형이다.
		//논리형은 기본적으로 조건식에 사용된다.
		
		int su1 = 90;
		int su2 = 80;
		//정수비교
		boolean result = su1 > su2;
		System.out.println(result);
		
		double su3 = 97.4;
		double su4 = 89.0;
		//실수비교
		result = su3 > su4;
		System.out.println(result);
		
		//정수와 실수비교 기능
		result = su1 > su4;
		System.out.println(result);
		
		char su5 = 'a';
		char su6 = 'c';	
		//문자끼리 비교
		result = su5 > su6;
		System.out.println(result);
		
		//정수와 문자 비교
		result = su1 > su5;
		System.out.println(result);
	}
}