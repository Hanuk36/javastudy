package com.ict.day17;

public class Test17 {
	public static void main(String[] args) {
		
		Ex12 t = returnString();
		t.showString("hello");
		
		showMyString(t);
		
		showMyString(new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str+"님 방가방가");
				
			}
		});
		
		Ex12 t2 = returnString2();
		t2.showString("lamda");
	}//main
	
	
	public static Ex12 returnString() {
		return s -> System.out.println(s+"님! 환영");
	}
	
	public static void showMyString(Ex12 k) {
		k.showString("world");
	}
	
	public static Ex12 returnString2() {
		return new Ex12() {
			@Override
			public void showString(String str) {
				System.out.println(str+"님 Hi");
				
			}
		};
	}

	
}//class