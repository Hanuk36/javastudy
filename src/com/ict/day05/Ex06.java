package com.ict.day05;

import java.util.Scanner;

public class Ex06 {
	//내일 아침에 일찍 와서 하기! 이거 보면 지우기!
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		
		while(true) {
			
			System.out.println("숫자 입력: ");
			int su = scan.nextInt();
			
			if(su % 2 == 0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
			System.out.println(su + "는 " + result + "입니다.");
			System.out.print("계속할까요? (1번이면 yes, 2. no >>");
			
			int res = scan.nextInt();
			if(res == 2) {
				break;
			}
		}
	}
}
