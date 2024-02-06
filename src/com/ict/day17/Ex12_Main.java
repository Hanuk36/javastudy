package com.ict.day17;

//   public interface Ex12 {
//	     void showString(String str);
//   }

public class Ex12_Main {
	public static void main(String[] args) {
		// Ex12 t = s -> System.out.println(s + "님 환영");
		
		Ex12 t = returnString();
		t.showString("hello ");
		
		showMyString(t);
		
		// 자바식-1
	    showMyString(new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str +"님 방가방가");
			}
		});
		
	    // 자바식-2
	    Ex12 t2 =returnString2();
	    t2.showString("Lamda ");
	}//메인 끝
	
	// 매개변수로 전달하는 람다식 
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}
	
	// 반환값으로 쓰이는 람다식
	public static Ex12 returnString() {  //Ex12 = 반환형 = 자료형. 
		return s-> System.out.println(s+ "님 환영");
	}
	
	// 자바식-2
	public static Ex12 returnString2() { 
		return new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str+"님 Hi");
			}
		};
	}
}



//////////////////////////////내꺼. 위에것이 선생님꺼
/*
public class Ex12_Main {
	public static void main(String[] args) {
		
		//Ex12 t = s -> System.out.println(s + "님 환영");
		
		Ex12 t = returnString();
		t.showString("Hello ");
		
		showMyString(t);
		
		//원래 전통적인 자바 방식1
		showMyString(new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str + "님 방가방가");
			}
		});
		
		//원래 전통적인 자바 방식2 - 연결
		Ex12 t2 = returnString2();
		t2.showString("Lamda");
	}
	
	//매게변수로 전달하는 람다식
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}
	
	//반환값으로 쓰이는 람다식을 쓴거다!
	public static Ex12 returnString() {
		return s -> System.out.println(s+ "님 환영");		
	}
	
	//원래 전통적인 자바 방식2 - 연결
	public static Ex12 returnString2() {
		return new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str+"님 Hi");
				
			}
		};
	}
}
*/
