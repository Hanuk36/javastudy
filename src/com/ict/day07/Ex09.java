package com.ict.day07;

import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		//String[] name = {"", "", "", "", ""};  //이렇게 해도 된다.
		int[] kor = new int[5];
		//int[] kor = {0,0,0,0,0};
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = {0, 0, 0, 0, 0};
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0};
		String[] hak = {"", "", "", "", ""};
		int[] rank = {1,1,1,1,1};
		
		String name2 = "";
		String inputName =  "";
		
		
		int inputKorScore = 0;
		int inputEngScore = 0;
		int inputMathScore = 0;
		
		for (int i = 0; i < rank.length; i++) {
			System.out.println("이름: ");
			name[i] = scan.next();
			
			System.out.println("국어점수를 넣으세요");
			kor[i] = scan.nextInt();
			
			System.out.println("영어점수를 넣으세요");
			eng[i] = scan.nextInt();
			
			System.out.println("수학점수를 넣으세요");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10) / 10.0; //소숫점 한자리까지 구하기
			
			if(avg[i]>= 90) {
				hak[i] = "A학점";
			}
			else if(avg[i]>= 80){
				hak[i] = "B학점";
			}
			else if(avg[i]>= 70){
				hak[i] = "C학점";
			}
			else {
				hak[i] = "F학점";
			}
		}
		
		//순위 구하자 (값이 채워진 상태에서)
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] == sum[j]) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		//출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(rank[i]+"\n");
		}
		
		/*int i = 0;
		while(i < 6) {
				System.out.println("이름을 넣으세요");
				inputName = scan.next();
				name[i] = inputName;
			
				System.out.println("국어점수를 넣으세요");
				inputKorScore = scan.nextInt();
				kor[i] = inputKorScore;
				
				System.out.println("영어점수를 넣으세요");
				inputEngScore = scan.nextInt();
				eng[i] = inputEngScore;
				
				System.out.println("수학점수를 넣으세요");
				inputMathScore = scan.nextInt();
				math[i] = inputMathScore;
				
				i++;
			}//밖 while */
	}
}
