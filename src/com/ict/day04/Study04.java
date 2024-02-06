package com.ict.day04;

import java.util.Scanner;

public class Study04 {

	public static void main(String[] args) {
		
		int menu = 0;
		int quantity = 0;
		int money = 0;
		int price = 0;
		int totalPrice = 0;
		int priceWithTax = 0;
		int change = 0;
		double tax = 0.1;
		
		String reset = "";
		
		
		String drink ="";
		
		boolean again = true;
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>   1. 카페모카(3500)  >>>>");
		System.out.println(">>>>   2. 카페라테(4000)  >>>>");
		System.out.println(">>>>   3. 아메리카노(3000) >>>>");
		System.out.println(">>>>   4. 과일주스(3500)  >>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Scanner scan = new Scanner(System.in);
		
		//메뉴
		System.out.println("메뉴를 선택하세요");
		menu = scan.nextInt();
		
		while(again) {
			
			if(menu == 1) {
				
				drink = "카페모카";
				price = 3500;
			}
			else if(menu == 2) {
				
				drink = "카페라테";
				price = 4000;
				
			}
			else if(menu == 3) {
				
				drink = "아메리카노";
				price = 3000;
				
			}
			else if(menu == 4) {
				
				drink = "과일주스";
				price = 3500;
				
			}
			else {
				again = false;
			}
			
		}
		
		/*
		switch(menu) {
		
		case 1 :
			drink = "카페모카";
			price = 3500;
			break;
		
		case 2 :
			drink = "카페라테";
			price = 4000;
			break;
		case 3 :
			drink = "아메리카노";
			price = 3000;
			break;
		case 4 :
			drink = "과일주스";
			price = 3500;
			break;
		default :
			System.out.println("다시 선택");
			break;
	}
		*/
		System.out.println("메뉴를 선택하셨습니다.");
		
		
		
		//몇잔
		System.out.println("몇 잔을 하시겠습니까?");
		quantity = scan.nextInt();
		System.out.println("몇 잔을 선택하셨습니다.");
		
		//입금
		System.out.println("입급할 금액");
		money = scan.nextInt();
		System.out.println("입금하셨습니다.");
		///////////////////////
		
		/*
		if(menu == 1) {
			
			drink = "카페모카";
			price = 3500;
		}
		else if(menu == 2) {
			
			drink = "카페라테";
			price = 4000;
			
		}
		else if(menu == 3) {
			
			drink = "아메리카노";
			price = 3000;
			
		}
		else if(menu == 4) {
			
			drink = "과일주스";
			price = 3500;
			
		}
		else {
			
			reset = "다시 고르세요";
			
		}
		*/
		
		priceWithTax = (int)(price * tax) + price;
		
		totalPrice = priceWithTax * quantity;
		
		change = money - totalPrice;
		
		System.out.println("잔돈 :" + change);
	}
}
