package com.ict.day11;

public class Ex14 {
	
	public static void main(String[] args) {
		
		//객체생성과 상관없이 호출 가능
		System.out.println(Ex13.num);
		System.out.println(Ex13.play2());
		System.out.println("---");
		//static private 은  접근 못함.
		//System.out.println(Ex13.age);
		
		//새로 객체가 만들어 질때 변수값은 초기화된다
		//static 은 static 에 따로 저장되기 때문에 숫자가 누적된다.
		
		//static 은 하나의 공간을 공유하나????????
		
		Ex13 t1 = new Ex13();
		System.out.println(t1.su); //11, new Ex13() 생성할때  할때 이미 값이 변함
		System.out.println(t1.num); //11,  변한값을 그냥 불러만 오는것임
		System.out.println(Ex13.num); //11, 변한값을 그냥 불러만 오는것임
		System.out.println("---");
		System.out.println();
		
		Ex13 t2 = new Ex13();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex13.num);
		System.out.println("---");
		System.out.println();
		
		Ex13 t3 = new Ex13();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex13.num);
		System.out.println("---");
		System.out.println();
	}
}
