package com.ict.day06;

public class Ex03 {

	public static void main(String[] args) {
		
		//다중 for 문에서 break 와 continue
		
		//break
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 6; j++) {
				
				if(i == 2) break; //for 문 자체를 빠져나감
				System.out.println("i=" + i + ", j=" + j);	
			}
		}
		System.out.println();

		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 6; j++) {
				
				if(j == 3) break;   //for 문 자체를 빠져나간다.
				System.out.println("i=" + i + ", j=" + j);	
			}
		}
		System.out.println();
		
		//continue
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 6; j++) {
				
				if(i == 2) continue; //2가 찍히지는 않지만 for 문을 나간건 아니다.
				System.out.println("ii=" + i + ", j=" + j);	
			}
		}
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			
			for (int j = 1; j < 6; j++) {
				
				if(j == 3) continue; //3만 출력안한다. for 문을 자체를 빠지지는 않는다.
				System.out.println("iii=" + i + ", j=" + j);	
			}
		}
	}
}