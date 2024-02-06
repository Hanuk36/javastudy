package com.ict.day08;

import java.util.Scanner;

public class Study08 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생수 : ");
		int su = scan.nextInt();
		
		//번호, 국어, 영어, 수학, 총점, 평균, 학점, 순위
		double[][] arr = new double[su][8];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			double[] p = new double[8];
			
			System.out.println("번호 : ");
			p[0] = scan.nextInt();
			
			System.out.println("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.println("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.println("수학 : ");
			p[3] = scan.nextInt();	
			
			p[4] = p[1] + p[2] + p[3];
			
			p[5] = (int)(p[4]/3.0*10)/10.0;
			
			if(p[5] >= 90) {
				p[6] = 'A';
			}else if(p[5] >= 80){
				p[6] = 'B';
			}else if(p[5] >= 70){
				p[6] = 'C';
			}
			else {
				p[6] = 'F';
			}
			p[7] = 1;
			
			arr[i] = p;	
		}
		
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) continue;
				if(arr[i][4]  < arr[j][4]) {
					arr[i][7]++;
				}
			}	
		}
		
		//정렬
		//임시저장할 배열
		double[] tmp = new double[8];
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {	
				if(arr[i][7] > arr[j][7]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		//출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		//번호, 국어, 영어, 수학, 총점, 평균, 학점, 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(j == 1 || j ==2 || j==3) {
					continue;
				}
				if(j == 5) {
					System.out.print(arr[i][j] + "\t");
				}
				else if(j == 6) {
					System.out.print((char)(arr[i][j]) + "\t");
				}
				else {
					System.out.print((int)(arr[i][j]) + "\t");
				}
				
				//System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}