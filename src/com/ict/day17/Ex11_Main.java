package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		
		Ex11 t1 = s -> System.out.println(s); //이렇게 처리하라는 공식, 방식을 알려주는 것
		t1.showString("Hello lamda_1"); // 위의 공식에 메서드를 불러서 그냥 인자값만 넣어주는 것
		
		
		
		// static 메서드는 static 메서드만 호출 할 수 있다.
		showMyString(t1); 
		
		showMyString(new Ex11() {
			@Override
			public void showString(String str) {
				System.out.println("Hello Lamda_3");
			}
		});
	}
	
	 
	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda_2");
	}	
}
