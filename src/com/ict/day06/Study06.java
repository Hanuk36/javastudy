package com.ict.day06;


import java.util.Scanner;

public class Study06 {

	public static void main(String[] args) {
		String res = "";
		int count = 0;
		int even = 0;
		Scanner scan = new Scanner(System.in);
		
		esc:while(true) {
			count++ ;
			
			System.out.print("숫자를 입력: ");
			
			int su = scan.nextInt();
			
			if(su % 2 == 0) {
				even++;
				res = "짝수";
			}
			else {
				res = "홀수";
			}
			System.out.println(su + " 는 " + res + "입니다");
			
			while(true) {
				
				System.out.println("계속할까요?(1.yes, 2.no >> ");
				
				int result = scan.nextInt();
				
				if(result == 1) {
					continue esc;
				}
				if(result == 2) {
					break esc;
				}
				System.out.println("제대로 입력하세요");
			}	
		}
		System.out.println("끝");
		System.out.println("전체횟수 " + count);
		System.out.println("짝수횟수 " + even);
	
		
		
		
		
		
		
		
		
		
		
		
		


	}
}