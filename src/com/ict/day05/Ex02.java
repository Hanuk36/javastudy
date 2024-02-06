package com.ict.day05;

import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		
		//for 문 정해진 규칙에 따라 실행문을 반복 처리 한다.
		//		조건식이 참일때 실행, 거짓이면 실행하지 않음
		//형식) for(초기식; 조건식; 증강식){
		//        조건식이 참일때 실행할 문장
		//        조건식이 참일때 실행할 문장
		//    {
		
		//1. for 문 만나면 초기식에 간다.
		//2. 초기식 가지고 조건식 간다.
		//3. 조건식 참이면 실행, 거짓이면 실행하지 않음
		//4. 참일때 실행하다가 for 문의 끝을 만나면 다시 증감식으로 간다.
		//5. 증감식에서 증가하거나 감소후 다시 조건식에 간다.
		//6. 조건식에서 참이면 실행, 거짓이면 실행하지 않음.
		
		//자바에서 블록안에서 변수를 만들고 선언하면 해당 블록에서만 사용 가능.
		//해당 블록을 벗어나면 변수는 사라진다.
		//for 문의 초기식에서 변수를 만들어 사용한다.
		//초기식에서 만든 변수는 for 문을 벗어나면 사용 못함 (즉, 사라진다.)
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i);
			System.out.println("hi");
			System.out.println("안녕하세요");
		}
		//for 문에서 만든 변수는 for 문 밖에서 사용 불가
		//System.out.println(i);    //for 문 밖에서 사용해서 에러난다. for 문 안에서의 지역변수다.
		
		int k1;
		for(k1 = 0; k1 < 10; k1++) {
			System.out.println("hi");
		}
		System.out.println("k1값: " + k1);
		System.out.println();
		
		//10~20 출력
		System.out.println("10~20 출력");
		
		for(int i = 10; i < 21; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//10 ~ 20까지 짝수만 출력
		System.out.println("10 ~ 20까지 짝수만 출력");
		
		for(int i = 10; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		//10 ~ 20까지 홀수만 출력
		System.out.println("10 ~ 20까지 홀수만 출력");
		
		for(int i = 10; i <= 20; i++) {        // i=i+2 로 해도 된다.
			if(i % 2 != 0) {
				System.out.println(i);         // i=i+2 로 해도 된다. i=11 로 시작
			}
		}
		System.out.println();
		
		//5단 출력
		System.out.println("5단 출력");
		
		for(int i = 1; i < 10; i++) {
			System.out.println("5*" + i + "=" + (i*5));
		}
		System.out.println();
		
		// 0000
		// 0000
		// 0000
		// 0000
		
		// 0000 을 하나로 보는 방법
		for(int i = 0; i < 4; i++) {
			System.out.println("0000");
		}
		System.out.println();
		
		// 4의 배수로 푸는 방법
		for (int i = 1; i < 17; i++) {
			System.out.print("0");
			if(i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		//0~10의 누적합
		int sum = 0; //이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum += i; //기억값 = 이전기억값 + 현재값
		}
		System.out.println("누적합: " + sum);
		System.out.println();
		
		// 0 - 10 홀수의 합계, 짝수의 합계를 각각 구하자
		int even = 0; //짝수의 합계
		int odd = 0;  //홀수의 합계
		
		for (int i = 0; i < 11; i++) {
			
			if(i % 2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		System.out.println("짝수의 합: " + even);
		System.out.println("홀수의 합: " + odd);
		
		// 7! (7*6*5*4*3*2*1) 의 합
		int sum3 = 1;
		for (int i = 7; i > 0; i--) {
			
			sum3 *= i; //누적값 = 이전값 + 현재값
		}
		System.out.println("7!의 곱: " + sum3);
		
		// 숙제
		// 1+(-2)+3+(-4)+ ...과 같은 식으로 계속 더해나갔을때,
		// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int neg = 0;
		int pos = 0;
		int negSum = 0;
		int posSum = 0;
		int totalSum = 0;
		int max = 100;
		
		for (int i = 1; i < 10; i++) {
			
			if(i % 2 == 0) {
				neg = i*(-1);
				negSum = negSum + neg;
			}
			else {
				pos = i;
				posSum = posSum + pos;
				
			}
			System.out.println("짝수합11: " + negSum);
			System.out.println("홀수합11: " + posSum);
			
			totalSum = negSum + negSum;
			System.out.println(totalSum);
			
		}
		
	}
}
