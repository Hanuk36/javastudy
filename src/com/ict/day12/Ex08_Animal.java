package com.ict.day12;

//추상클래스 : 하나 이상의 추상메서드를 가지고 있는 클래스
//          일반적인 변수와 상수, 메서드도 가질 수 있습니다.
//          반드시 abstract 가 붙는다.
//          추상 클래스는 new 예약어를 사용해서 인스턴스 객체를 만들 수 없다.(?)
//          익명 내부클래스 타입으로는 생성 가능
public abstract class Ex08_Animal { //abstract 지우면 sound 메서드에서 오류난다.
	
	int leg = 4;
	boolean live = true;
	
	public void play() {
		System.out.println("열심히 달린다.");
	}
	
	//추상메서드 : body 를 가지고 있지 않는 메서드를 말한다. (블록이 없다)
	//          즉, 구체적으로 실행하는 실체가 없다. (실행하는 수행문이 없다)
	public abstract void sound();	
}
