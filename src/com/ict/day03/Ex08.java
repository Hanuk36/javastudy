package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		
		//문제: 3989초는 몇시간 몇분 몇초 일까요?
		
		//*** 강사님이 푼 답 ***
		
		int total = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; //나머지 저장
		
		//시간을 구하자
		h = total / (60 * 60);
		res = total % (60 * 60);
		
		m = res / (60);
		s = res % (60);
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		
		//*** 내가 푼 답 ***
		
		/*
		int sample = 3989;
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		int UNIT = 60;
		
		hour = sample / (UNIT * UNIT);
		
		minute = sample / UNIT % UNIT;
		
		second = sample % UNIT;
		
		System.out.println("3989초는 " + hour + "시간 " + minute + "분 " + second + "초 와같다.");
		*/
	}
}
