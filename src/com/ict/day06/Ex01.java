package com.ict.day06;

public class Ex01 {

	public static void main(String[] args) {
		
		//do ~while 문 : while 문과 같은 반복문 (선처리 후비교)
		//형식) 초기식;
		//     do{
		//       참일때 실행할 문장;
		//       참일때 실행할 문장;
		//       참일때 실행할 문장;
		//       증감식;
		//     }while(조건식);
		
		// 1~10까지 출력
		
		int k1 = 0;
		do {
			System.out.println(k1);
			k1++;
		}while(k1 < 11);
		
		
		System.out.println();
		
		
		//0~10 짝수만 출력
		int k2 = 0;
		do {
			if(k2 % 2 == 0) {
				System.out.println(k2);
			}
			k2++;
		}while(k2 < 11);
	}
}
