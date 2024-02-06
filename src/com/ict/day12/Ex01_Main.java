package com.ict.day12;

public class Ex01_Main {

	public static void main(String[] args) {
		
		//자식 클래스를 객체 생성하면 부모클래스가 먼저 만들어지고
		//그 다음에 자식 클래스가 만들어진다.
		Ex01_Sub t = new Ex01_Sub();
		System.out.println(t);
		//부모 생성자: com.ict.day12.Ex01_Sub@49e4cb85
		//자식 생성자: com.ict.day12.Ex01_Sub@49e4cb85
		//com.ict.day12.Ex01_Sub@49e4cb85
		
		//자기 자신의 생성자 this
		//부모의 생성자 super
		//자식 객체를 생성했더니 부모클래스가 먼저 만들어 진다.
		
		
		t.play();
		//부모필드의 맴버필드가  private 아니면 접근 가능하다
		System.out.println(t.addr);
		System.out.println(t.age);
		
		//static 객체, 상속 등과 상관없이 그냥 호출 가능
		//클래스이름.맴버필드, 클래스이름.맴버매서드
		System.out.println(Ex01_Sup.car);
		System.out.println(Ex01_Sup.GENDER);
	}
}