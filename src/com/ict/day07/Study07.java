package com.ict.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Study07 {
	
	public static void main(String[] args) {
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = new int[5];
		rank[0] = 1;
		rank[1] = 1;
		rank[2] = 1;
		rank[3] = 1;
		rank[4] = 1;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < name.length ; i++) {
			
			System.out.println("학생이름");
			name[i] = scan.next();
			
			System.out.println("국어점수");
			kor[i] = scan.nextInt();
			
			System.out.println("영어점수");
			eng[i] = scan.nextInt();
			
			System.out.println("수학점수");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10) / 10.0;
			
			if(avg[i] >= 90) {
				
				hak[i] = "A학점";
			}
			else if(avg[i] >= 80) {
				
				hak[i] = "B학점";
			}
			else if(avg[i] >= 70) {
				
				hak[i] = "C학점";
			}
			else {
				
				hak[i] = "F학점";
			}
		}
		
		for (int i = 0; i < name.length; i++) {
			
			for (int j = 0; j < name.length; j++) {
				
				if(sum[i] == sum[j]) continue;
				if(sum[i] < sum[j]){
					
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"\n");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
