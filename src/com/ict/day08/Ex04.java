package com.ict.day08;

import java.util.Iterator;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int[] p1 = {1, 270, 90,  'A', 1};
		int[] p2 = {2, 210, 70,  'C', 1};
		int[] p3 = {3, 180, 60,  'F', 1};
		int[] p4 = {4, 300, 100, 'A', 1};
		int[] p5 = {5, 285, 90,  'A', 1};
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		//순위를 구해보자. (다보고)
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) continue;  //  if(i == j) 라고 해도 된다.
				//각 배열의 총점을 비교하자
				if(arr[i][1] < arr[j][1]){
					arr[i][4]++;
				}
			}
		}
		
		//정렬하기 위해 임시배열 만들기
		int[] temp = new int[5];
		
		//정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				temp = arr[i];
				if(arr[i][4] > arr[j][4]) { // 오름차순이라서 >, 내림차순이면 <
					
					temp = arr[i]; //i 정보는 temp 에 넣음. i정보는 사라짐.
					arr[i] = arr[j]; //j를 i에 집어넣음
					arr[j] = temp;
				}
			}
		}

		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(j == 3) {
					System.out.print((char)(arr[i][j]) + "\t");
				}
				else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
	}
}
