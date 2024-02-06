package com.ict.day04;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//if ~ else 문
		//삼항연산자와 비슷하게 처리
		//즉, 조건식이 참일때와 거짓일때 각각 나누어서 처리한다.
		//주의사항) 한줄은 블록 생략 가능
		//if(조건식){
		//   조건식이 참일때 실행;
		//   조건식이 참일때 실행;
		//   조건식이 참일때 실행;
		//}else{
		//   조건식이 거짓일때 실행;
		//   조건식이 거짓일때 실행;
		//   조건식이 거짓일때 실행;
		//}
		
		//k1 이 홀수인지 짝수인지 판별
		//힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수
		int k1 = 7;
		String result1 = "초기값";
		
		if (k1 % 2 ==0) {
			
			result1 = "짝수";
		
		} else {
			
			result1 = "홀수";
		
		}
		System.out.println("k1 : " + result1 + " 입니다.");
		
		//int k2가 60이상이면 합격 아니면 불합격
		int k2 = 70;
		String result2 = "";
		
		if (k2 > 60) {
			
			result2 = "합격";
			
		} else {
			
			result2 = "불합격";

		}
		System.out.println("k2 : " + result2 + " 입니다.");
		
		
		//k3가 1이면 가격에 0.1 할인(10%) 한다.(얼마에 살 수 있나)
		int k3 = 1;
		int price = 1000;
		int result3 = 0;
		
		if (k3 == 1) {
			
			result3 = price - (int)(price * 0.1);
			
		} else {
			
			result3 = price;

		}
		System.out.println("k3 : " + result3 + " 입니다.");
		
		//char k4 = 대문자인지, 대문자가 아닌지 판별하자.
		char k4 = 'A';
		String result4 = "초기값";
		
		if (k4 >= 'A' && k4 <= 'Z') {
			
			result4 = "대문자";
			
		} else {
			
			result4 = "대문자 아님";
			
		}
		System.out.println("k4 : " + result4 + " 입니다.");
		
		
		//근무시간이 8시간 까지는 시간당 9860 이고
		//8시간 초과한 시간 만큼은 1.5배 지급한다.
		//현재 근무한 시간이 10시간 읻.
		//얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		int pay = 0;
		int limit = 8;
		
		if (time > limit) {
			
			pay = (int)(dan * 1.5 * (time - limit) + (limit * dan));
			
		} else {
			
			pay = time * dan;
			
		}
		System.out.println("결과 : " + pay + " 입니다.");
	}
}