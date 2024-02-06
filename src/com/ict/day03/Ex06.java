package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		
		//문제:
		//이름이 홍길동인 사람의 점수가
		//국어: 90, 영어: 80, 수학 80 이다.
		//총점과 평균을 구하라.
		//출력은 이름, 총점, 평균만 출력하자 (단, 평균은 소수점 첫째자리 까지 구하자)
		
		//*** 강사님이 푼 답 ***
		
		//입력정보
		//이름저장
		String name = "홍길동";
		
		//국어저장
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		//요구사항(처리 = 비지니스로직)
		//총점과 평균
		int sum = kor + eng + math;
		
		//정수와 실수가 산술연산하면 실수가 된다.(소수점이 있다.)
		double avg  = (int)(sum / 3.0 * 10) / 10.0; //소수점 한자리까지만 구함
		double avg2 = (int)(sum / 3.0 * 100) / 100.0;//소수점 두자리까지만 구함
		
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("평균: " + avg2);
		
		System.out.println();
		
		//끝의 한자리 5를 버리고 5를 0으로 대신한다.
		int k = (198745 / 10);
		int k1 = (198745 / 10) * 10; //나누기 10을 한다, 그리고 곱하기 10한다.
		
		System.out.println(k);
		System.out.println(k1);
		
		//끝의 두자리 45를 버리고 45를 00으로 대신한다.
		int k0 = (198745 / 100);
		int k2 = (198745 / 100) * 100; //나누기 100을 한다, 그리고 곱하기 100한다.
		
		System.out.println(k0);
		System.out.println(k2);
		
		
		
		
		
		
		//*** 내가 푼 답 ***//
		
		/*
		String name = "홍길동";
		
		int korean = 90;
		int english = 80;
		int math = 80;
		int TOTAL_SUBJECTS = 3; //상수
		
		int totalScore = 0;
		double totalAvg = 0;
		
		//요구사항 (처리 = 비지니스로직)
		totalScore = korean + english + math;
		
		totalAvg = (double)totalScore / TOTAL_SUBJECTS;
		
		String totalAverage = String.format("%.1f", totalAvg);
		
		System.out.println(name + "의 총점은:" + totalScore + " , 평균은:" + totalAverage);	
		*/
	}
}