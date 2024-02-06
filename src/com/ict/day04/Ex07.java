package com.ict.day04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input  = 0; //내가 내는 돈
		int menu   = 0; //메뉴
		int su     = 0; //사람수
		int dan    = 0; //가격
		int total  = 0; //가격 + 사람수
		int vat    = 0; // 10% 세금
		int output = 0; //잔돈
		String drink = "";
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>>>   1. 카페모카(3500)  >>>>");
		System.out.println(">>>>   2. 카페라테(4000)  >>>>");
		System.out.println(">>>>   3. 아메리카노(3000) >>>>");
		System.out.println(">>>>   4. 과일주스(3500)  >>>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("메뉴를 선택하세요");
		menu = scan.nextInt();
		
		System.out.println(menu + " 번을 선택하셨습니다."); //
		
		System.out.println("몇 잔을 하시겠습니까?");
		su = scan.nextInt();
		
		System.out.println(su + "잔을 선택하셨습니다."); //
		
		System.out.println("입급할 금액");
		input = scan.nextInt();
		
		System.out.println(input + "을 입금하셨습니다."); //
		
		if(menu == 1) {
			drink = "카페모카";
			dan = 3500;
			
		}else if(menu == 2) {
			drink = "카페라테";
			dan = 4000;
		}
		else if(menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}
		else if(menu == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		
		//단가 * 수령
		total = dan * su;
		vat = (int)(total * 0.1);
		output = input - (total + vat);

		System.out.println("잔돈 : " + output + " 입니다.");
	}
}
