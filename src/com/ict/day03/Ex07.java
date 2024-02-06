package com.ict.day03;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//문제: 2시간 40분 30초를 초로 환산 하여라. 즉, 몇초 일까요?
		
		//*** 강사님이 푼 답 ***
		
		int h = 2 * 60 * 60;
		int m = 40 * 60;
		int s = 30;
		
		int total = h + m + s;
		
		System.out.println("2시간 40분 30초는 " + total + "초 입니다.");
		
		
		//*** 내가 푼 답 ***
		
		/*
		int hour = 2;
		int minute = 40;
		int second = 30;
		int result = 0;
		
		int UNIT = 60; //상수
		
		result = (hour * UNIT * UNIT) + (minute * UNIT) + second;
		
		System.out.println("2시간 40분 30초를 초로 환산한 값: " + result + "초");
		*/
	}
}