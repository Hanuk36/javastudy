package com.ict.day17;

public class Ex01 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 51; i++) {
			System.out.println
			("run : " + Thread.currentThread().getName());
		}
		
		//메소드가 메소드 호출
		play();
		System.out.println
		("111 : " + Thread.currentThread().getName());
		
	}
	
	public void play() {
		System.out.println
		("first : " + Thread.currentThread().getName());
	}
}
