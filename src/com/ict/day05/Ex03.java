package com.ict.day05;

public class Ex03 {

	public static void main(String[] args) {
		
		//중첩 for 문: for 문 안에 또 다른 for 문이 존재하는 것
		for (int i = 0; i < 4; i++) {
			System.out.println("명령문1");
			for (int j = 0; j < 6; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println("명령문2");
		}
		System.out.println();
		
		// 구구단 문제
		
		//1번답
		System.out.println("구구단 1번");
		
		int result1 = 0;
		
		for (int i = 2; i < 10; i++) {
			
			System.out.println(i + "단");
			
			for (int j = 1; j < 10; j++) {
				
				result1 = i * j;
				
				System.out.println(i + "*" + j + "=" + result1 + "  ");
			}
			
		}
		
		//2번답
		System.out.println("구구단 2번");
		
		int result2 = 0;
		
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				
				result2 = i * j;
				
				System.out.print(i + "*" + j + "=" + result2 + " ");
			
			}
			System.out.println(); // 이게 핵심
		}
		
		
		System.out.println();
		
		//3번답
		System.out.println("구구단 3번");
		int result3 = 0;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				result3 = i * j;
				System.out.print(j + "*" + i + "=" + result3 + " ");
			}
			System.out.println();
		}
		
		
		//0000
		//0000
		//0000
		//0000
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
		
		//1000
		//0100
		//0010
		//0001
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				if(i == j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
