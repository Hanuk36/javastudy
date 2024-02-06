package com.ict.day10;

public class Ex12 {
 ///////////////다시적기
	/////////
	/////////////////
	public static void main(String[] args) {
		
		Ex11 t = new Ex11();
		
		//변경 전 이름 가져오기 (getter)
		System.out.println(t.getName());
		//홍길동을 둘리로 변경하자
		t.setName("둘리");
		//
		System.out.println(t.getName());
		
		
		//
		System.out.println(t.getAge());
		t.setAge(15000);
		System.out.println(t.getAge());
	}
}
