package com.ict.day09;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//static 은 객체 생성과 상관없이 호출 가능
		//호출방법 : 클래스이름.맴버필드  ,   클래스이름.맴버매서드
		System.out.println(Ex06.kor);
		System.out.println(Ex06.eng);
		System.out.println(Ex06.math);
		
		System.out.println();
		System.out.println("-- Ex06.play01--");
		
		//메서드도 같다.
		Ex06.play01();
		
		System.out.println("-- Ex06.play02--");
		
		int k = Ex06.play02();
		System.out.println(k);
	}
}
