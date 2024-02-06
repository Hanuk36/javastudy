package com.ict.day17;

public class Ex02_Main {
	public static void main(String[] args) {
		
		Ex02 test = new Ex02();
		
		new Thread(test, "dog").start(); // 스레드 이름이 dog
		new Thread(test, "cat").start(); // 스레드 이름이 cat
		new Thread(test, "tiger").start(); // 스레드 이름이 tiger
		new Thread(test, "lion").start(); // 스레드 이름이 lion
		
		System.out.println("main : " + Thread.currentThread().getName() );
		
		
		//나만의 연습
//		try {
//			new Thread(test, "dog").join();
//			new Thread(test, "cat").join(); 
//			new Thread(test, "tiger").join(); 
//			new Thread(test, "lion").join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} 
		System.out.println("수고");
		
		
	}

}
