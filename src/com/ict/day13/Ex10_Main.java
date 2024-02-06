package com.ict.day13;

public class Ex10_Main {
	public static void main(String[] args) {
		// 인터페이스 객체 생성 안됨
		// Ex06_Add t1 = new Ex06_Add();
		
		// 추상클래스 객체 생성 안됨
		// Ex08_Oper t2 = new Ex08_Oper();
		
		// 일반 클래스 ///////
		//Ex09_Calc t3 = new Ex09_Calc();
		//double res = t3.plus(10, 4);
		//System.out.println(res);
		
		
		
		
		
		Ex06_Add t = new Ex09_Calc();
		t.plus(1.4, 2.5);
		//t.minus(1.4, 2.5);
		//t.mul(1.4, 2.5);
		//t.div(1.4, 2.5);
		
		
		
		Ex09_Calc t4 = new Ex09_Calc();
		t4.plus(1.4, 2.5);
		t4.minus(1.4, 2.5);
		t4.mul(1.4, 2.5);
		t4.div(1.4, 2.5);
	}
}
