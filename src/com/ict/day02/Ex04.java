package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		//실수: 소수점이 있는 숫자
		//     float < double
		//     실수의 기본은 double
		
		//float 는 숫자 뒤에 반드시 F 나 f 를 붙힌다.
		
		//줄단위 복사: 해당 위치에서 ctrl + alt + 아래방향키
		//줄이동: 해당 위치에서 alt + 위/아래 방향키
		float f1 = 3.14F;
		System.out.println(f1);
		
		float f2 = -25.0f;
		System.out.println(f2);
		
		//숫자뒤에 f 또는 F를 붙이지 않으면 오류
		//float f3 = 45.4;
		
		double d1 = 3.14;
		System.out.println(d1);
		
		//중요 float 나 double 은 부동소숫점으로 값을 표현하므로 정확하게 표현이 안되는 오류가 발생
		//해결)나중에는 BigDecimal 클레스를 자료형으로 사용
		//   현재는 소수점이하 몇 자리 버림, 올림, 반올림을 이용하자
	}
}
