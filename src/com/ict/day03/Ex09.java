package com.ict.day03;

public class Ex09 {
	
	public static void main(String[] args) {
		
		//문제:
		//카페모카 6500원이다.
		//친구와 둘이서 15000원을 내고 주문했다.
		//잔돈은 얼마인가? (단, 부가세 10%포함) 6500 + 부가세 10%
		
		//*** 강사님이 푼 답 ***
		
		//String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		
		int total = dan * su; //dan = 단가, su = 수량
		int vat = total / 10;
		int vat1 = (int)(total * 0.1);
		int sum = total + vat;
		
		//다른방법
		int sum2 = (int)(total * 1.1);
		int output = input - sum;
		
		System.out.println("세금 구하는 방법1: " + vat);
		System.out.println("세금 구하는 방법2: " + vat1);
		System.out.println("세금 포함한 2잔 커피 가격 방법1: " + sum);
		System.out.println("세금 포함한 2잔 커피 가격 방법2: " + sum2);
		System.out.println("잔돈: " + output);
		
		
		
		
		
		
		//*** 내가 푼 답 ***
		
		/*
		int cafeMocha = 6500;
		int money = 15000;
		int change = 0;
		
		double tax = 1.10;
		change = money - (int)((cafeMocha*2) * tax);
		
		System.out.println("세금 포함한 2잔 커피 가격: " + (int)((cafeMocha*2) * tax));
		System.out.println(change + "원");
		*/
	}
}
