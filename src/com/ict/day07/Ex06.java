package com.ict.day07;

public class Ex06 {
	
	public static void main(String[] args) {
		
		//배열 정렬하기
		int temp = 0; // 자리 바꾸기 위한 임시변수
		
		int[] s1 = {3,4,9,8,2,1,7,10,5,6};
		
		for (int i = 0; i < s1.length - 1; i++) {
			
			for (int j = i + 1; j < s1.length; j++) {
				
				//System.out.println("i=" + i + ", j=" + j);
				// i > j 오름차순, i < j 내림차순
				if(s1[i] > s1[j]) {  // < 이면 내림차순 된다.
					System.out.println(i + " 자리 바꾸기 " + j);
					//자리변경
					temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}	
		}
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println();
	}
}
