package com.ict.day09;

public class Ex15 {
	
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//반환형이 있는 메서드
	public String play01(String k1) {
		name = k1;
		return name;
	}
	
	//지역변수는 메서드가 끝나면 사라진다.
	public int play02(int kor, int eng, int math) { 
		int total = kor + eng + math;
		return total;
	}
	
	//전역변수에 값이 저장된다.
	public int play03(int kor, int eng, int math) {
		sum = kor + eng + math;
		return sum;
	}
}