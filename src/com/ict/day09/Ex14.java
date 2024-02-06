package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Ex12 t1 = new Ex12();
		t1.play02("윤보라", 100, 97, 92);
		
		System.out.println();
		
		Ex13 t2 = new Ex13();
		t2.play02("이효린", 90, 92, 90);
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scan.next();
		
		System.out.println("국어: ");
		int kor = scan.nextInt();
		
		System.out.println("영어: ");
		int eng = scan.nextInt();
		
		System.out.println("수학: ");
		int math = scan.nextInt();
		
		t2.play02(name, kor, eng, math);	
	}
}