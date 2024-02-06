package com.ict.day07;

public class Ex05 {
	
	public static void main(String[] args) {
	
		// String.getBytes()               : byte[]   //입출력에 많이 쓰임
		// String.toCharArray()            : char[]   //입출력에 많이 쓰임
		// split(String regex)             : String[]
		// split(String regex, int limit)  : String[]
		
		
		
		
		System.out.println("--getBytes()--");
		//1. String.getBytes() : byte[]
		//   해당 문자열을 byte[]로 변환시킨다.
		//   보통 입출력때 사용(대문자, 소문자, 숫자, 영어 이외에는 안됨)
		
		String s1 ="java 대한 JAVA";
		
		byte[] b1 = s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
		
		
		
		
		System.out.println();
		System.out.println("--toCharArray()--");
		
		
		
		// String.toCharArray() 
		     //String s1 ="java 대한 JAVA";
		char[] c1 = s1.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		
		
		System.out.println();
		System.out.println("--split()--");
		
		//2. split(String regex) : String[]
		//   split(String regex, int limit) : String[]
		//   String regex => 구분자(나눌기준),
		//   int limit => 나눌 배열의 크기
		
		String s2 = "사과, 딸기, 망고, 오렌지, 두리안, 응과";
		String[] s3 = s2.split(",");
		
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		System.out.println("-***-");
		System.out.println();
		
		String[] s4 = s2.split("  ");
		for (int i = 0; i < s4.length; i++) {
			System.out.println(s4[i]);
		}
		
		System.out.println();
		System.out.println("-$$$-");
		System.out.println();
		
		//배열 공간이 모자르면 마지막 베열공간에 나머지 한 배열공간에 모두 들어간다.
		String[] s5 = s2.split(" ", 3);
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		System.out.println("---");
		
		//배열공간을 남게 지정하면 최대한 사용하고 나머지 공간은 삭제된다.
		String[] s6 = s2.split(" ", 15);
		for (int i = 0; i < s6.length; i++) {
			System.out.println(s6[i] + " 먹기");
		}
	}
}