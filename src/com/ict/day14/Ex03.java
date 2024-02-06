package com.ict.day14;

public class Ex03 {
	String name = "둘리";
	private int age = 3;
	
	public Ex03() {
		System.out.println("외부: " + this);
	}
	
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	//내부클래스를 가지고 있는 메서드
	public void play() {
		int age = 147;
		int cnt = 10;
		
		//메서드 안에 있기떄문에 지역변수랑 똑같다. play()메서드가 실행되야 실행된다.
		class Inner02{
			String addr = "서울";
			//int age = 15;
			 
			public Inner02() {
				System.out.println("내부: " + this);
			}
			
			public void like() {
				System.out.println(name);
				System.out.println(age); //우선순위: 지역변수
				
				//외부클래스의 this 와 내부클래스의 this 가 다르다.
				System.out.println(addr);
				System.out.println(this.addr);  //this 해도 바로 위에것랑 같다.
				//외부 클래스의 메서드 사용
				sound(); //불르수 있다.
			}
			//내부 메서드 끝
			public void setA(int k) {
				System.out.println("k: " + k);
			}
			//외부클래스의 메서드 사용불가
			//sound(); //못부름
			
		}	//내부 클래스 끝
		Inner02 inner02 = new Inner02();
		System.out.println("$====$");
		System.out.println(name);
		System.out.println(this.age); //this 를 붙히면 전역이 된다. //3
		System.out.println("-----");
		inner02.like();
		System.out.println("=================");
		System.out.println(age);
		System.out.println(this.age);
		inner02.setA(this.age);		
		
	}//외부 메서드 끝 
	
}//외부 클래스끝









/*
 * 
 *선생님꺼
// Local 내부클래스
public class Ex03 {
	String name = "둘리";
	private int age = 3 ;
	
	public Ex03() {
		System.out.println("외부 : " + this);
	}
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	// 내부클래스를 가지고 있는 메서드
	public void play() {
		int age = 147 ;
		int cnt = 10 ;
		class Inner02{
			String addr = "서울";
			public Inner02() {
				System.out.println("내부 : " + this);
			}
			public void like() {
				System.out.println(name);
				System.out.println(age);
   			    // 외부클래스의 this와 내부클래스의 this가 다르다. 
				//System.out.println(this.age);
				System.out.println(this.addr);
				// 외부클래스의 메서드 사용 가능 
				sound();
			} // 내부 메서드 끝
			public void setA(int k) {
				System.out.println(k);
			}
			// 외부클래스의 메서드 사용 불가
			// sound() ;
			
		}// 내부 클래스 끝
		Inner02 inner02 = new Inner02();
		// System.out.println(name); 
		// System.out.println(this.age); // 3
		inner02.like();
		System.out.println("============");
		inner02.setA(this.age);
	}// 외부 메서드 끝
}  // 외부 클래스 끝

*/
