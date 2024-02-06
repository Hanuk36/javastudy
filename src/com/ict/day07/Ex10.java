package com.ict.day07;

import java.util.Arrays;

public class Ex10 {
	
	public static void main(String[] args) {
		
		int[] su = {-10, 0, 10, 25, -90, 95};
		
		// Array.sort 오름차순 정리한다.
		// 인덱스값이 0 이 가장 작은 것. 인텍스값이 su.length-1 이 가장 큰값을 가지고 있다.
		//Arrays.sort(su);
		
		Arrays.sort(su);
		
		for(int i = 0 ; i < su.length ; i++) {
			System.out.println(su[i]);
		}
		
		System.out.println("-------");
		
		System.out.println("가장 작은값 : " + su[0]);
		System.out.println("가장 큰값 : " + su[su.length -1]);

	}
}
