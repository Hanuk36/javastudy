package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//전체횟수, 짝수횟수. 퍼센트(소수점 첫자리까지)
		
		int count = 0;          //전체 횟수
		int even = 0;           //짝수 횟수
		double percent = 0.0;
		
		esc:while(true) {
				
			count++;
			//숫자를 받아서 홀수인지, 짝수인지 출력하자.
			
			System.out.print("숫자 입력: ");
			
			int su = scan.nextInt();
			String res = "";
			
			if(su % 2 == 0) {
				even++;
				res = "짝수";
			}
			else {
				res = "홀수";
			}
			System.out.println(su + "는 " + res + "입니다.");
			
			while(true) {
				
				System.out.println("계속할까요?(1.yes, 2.no >> ");
				int result = scan.nextInt();
				if(result == 1)continue esc;
				if(result == 2) break esc;
				
				System.out.println("제대로 입력하세요");
			} //안쪽 while
		}//밖 while
		
		percent = (even/(count*1.0)) * 100;
		System.out.println(percent);
		System.out.println("수고하셨습니다.");
		System.out.println("while 을 " +  count + "돌았습니다");
		System.out.println("while 문을 짝수 횟수는 " +  even + "입니다");
		System.out.println("짝수의 퍼센트는 " + (int)(percent*100)/100.0);
	}
}
