package com.ict.day17;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test, "dog").start(); // 스레드 이름이 dog
		new Thread(test, "cat").start(); // 스레드 이름이 cat
		new Thread(test, "tiger").start(); // 스레드 이름이 tiger
		new Thread(test, "lion").start(); // 스레드 이름이 lion
		
		System.out.println("main : " + Thread.currentThread().getName() );
	}
}
