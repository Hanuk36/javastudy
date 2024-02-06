package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal {
	
	public void play() {
		//age = age + 10; 
		super.age = age + 10; //super 나 this 써도 된다.
		//부모의 맴버필드이기 때문에 super 가 났다. 안써도 무방하다.
		System.out.println(age);
	}
	
	public void play2() {
		//사용하는 것은 가능
		age = month + 10;
		
		//데이터를 변경하는 것은 안됨. month 가 final 이기 때문에
		//month = month + 10;
	}
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
	//부모클래스의 sleep()에 final 있으므로
	//오버라이딩 불가
//	@Override
//	public final void sleep() {
//		System.out.println("15이상 잠을 잔다.");
//	}
	
	
}		
