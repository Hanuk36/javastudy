package com.ict.day09;

public class Ex06 {
	
	//전역변수 새깔은 파란색. 지역변수 색깔은 갈색
	String name = "홍길동";
	static int kor = 80;
	static int eng = 95;
	static int math = 95;
	int total = 0;
	
	//static 메서드
	public static void play01() {
		//지역 변수는 메서드가 만들어질때 만들어진다.
		//static 메서드가 전역변수를 사용하기 위해서는 전역변수도 static 이여야 한다.
		//지역변수에 static 사용할수 없다.
		//static int sum  <= 지역변수에 static 하면 오류남.
		int sum = kor + eng + math;
		
		//System.out.println(name);
		System.out.println(kor);
		System.out.println(sum);	 
	}
	
	public static int play02() {
		int sum = kor + eng + math;
		return sum;
	
	}


}
