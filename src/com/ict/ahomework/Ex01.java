package com.ict.ahomework;

public class Ex01 {
	public static void main(String[] args) {
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		// 100 이상이 되는지 구하시오.
		
		int sum = 0;
		int cnt = 0;
		
		for (int i = 0; sum <=99; i++) {
			
			if(i%2 == 0) {
				sum -= i;
			}
			else {
				sum += i;
			}
			cnt = i;
		}
		System.out.println(cnt);	
	}
}
