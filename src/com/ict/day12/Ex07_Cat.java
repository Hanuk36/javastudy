package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{
	
	int id = 124123;
	
	public Ex07_Cat() {
		// super([인자]); //부모생성자를 부른다. 생략되어 있다.
		// super : 부모클레스의 주소를 참조
		// super([인자]): 부모클래스의 생성자
		
		super("짜오", 3); //위에 인자가 두개 있을경우
		System.out.println("자식생성자");
	}
	
	//모든 자식 클라스는 부모클라스의 생성자를 참조해야 한다.
	public Ex07_Cat(String name) {
		//super([인자])와 this([인자])는 둘다 첫줄에만 사용가능
		//즉, 둘중 하나만 사용 가능
		super(name, 7);
		//this();
		//똑같은 부모클라스 생성자가 없어서 오류
	}
	
	public Ex07_Cat(int age) {
		//public Ex07_Cat() 생성자로 가겠다는 의미
		this();
		//this() 없으면 오류난다.
	}		
}
