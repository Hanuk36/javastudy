package com.ict.day09;

public class Ex03 {
	
	public static void main(String[] args) {
		
		// Math 클래스 주요 메소드
		//     : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현에 놓은 클래스
		
		// 상수: E, PI
		System.out.println(Math.E);  //E에 마우스 대고 ctrl + shift => s 란 의미는 static, F 는 final
		System.out.println(Math.PI); //월주율
		
		System.out.println();
		System.out.println("-----");
		
		//메서드 모두 static 이다.
		//생성자는 없다. => 객체 생성으로 할수없다. Math.메소드() 로 접근이 가능
		
		//1. random() : 0.0 ~ 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int)(Math.random()); // 무조건 0 나온다.
		int k2 = (int)(Math.random() * 10); // 0~9
		int k3 = (int)(Math.random() * 3); // 0~2
		int k4 = (int)(Math.random() * 6) + 2; // 2~7
		int k5 = (int)(Math.random() * 45) + 1; // 1~45
		
		System.out.println();
		
		
		
		//2. ceil() : 올림,  round() : 반올림,   floor 가 버림
		System.out.println("ceil : 가장 큰 정수");
		System.out.println(Math.ceil(10.0));     // 10
		System.out.println(Math.ceil(10.1231));  // 11
		System.out.println(Math.ceil(-10.0));    // -10.0
		System.out.println(Math.ceil(-10.1231)); // -10.0
		
		
		System.out.println();
		System.out.println("floor : 가장 작은");
		System.out.println(Math.floor(10.0));      //10.0
		System.out.println(Math.floor(10.984));    //10.0
		System.out.println(Math.floor(-10.0));     //-10.0
		System.out.println(Math.floor(-10.984));   //-11.0
		
		
		System.out.println();
		System.out.println("round : 반올림(소수점 첫째자리기준");
		System.out.println(Math.round(10.0));  // 10
		System.out.println(Math.round(10.4));  // 10
		System.out.println(Math.round(10.5));  // 11
		System.out.println(Math.round(10.6));  // 11
		
		
		//abs() : 절대값 (양수 -> 양수,  음수 -> 양수
		System.out.println();
		System.out.println("abs : 절대값 (양수 -> 양수,  음수 -> 양수");
		System.out.println(Math.abs(10));        // 10
		System.out.println(Math.abs(-10));       // 10
		System.out.println(Math.abs(-10.1231));  // 10.1231
		
		
		//max(수1, 수2) : 큰값,   min(수1, 수2) : 작은값
		System.out.println();
		System.out.println("Math.max");
		System.out.println(Math.max(15, 15.0009)); //15.0009
		
		System.out.println("Math.min");
		System.out.println(Math.min(15, 15.0009)); //15.0
	}
}
