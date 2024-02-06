package com.ict.day04;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력하세요> ");
		String str1 = scan.next();
		System.out.println(str1);
		
		System.out.print("또 입력하세요> ");
		String str2 = scan.nextLine();
		System.out.println(str2);
	}
}
