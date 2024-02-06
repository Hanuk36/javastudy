package com.ict.day16;

//스레드 만들어서 처리 하려면
public class Ex08_TestA extends Thread {
	
	// 메인이 다 일처리해서 쓰레드가 안생김. 즉 start 에서 run 가서 다시 start 가야 되는데
	// start 메서드 가 있어서 그냥 start를 수행한다. run 에 안간다. 그래서 쓰레드가 안만들어지고 메인이 다 일처리 하고 끝난다.
	// 그래서 싱글쓰레드가 된다.
	
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa: " + i + Thread.currentThread().getName());		
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa: " + i + Thread.currentThread().getName());		
		}
	}
}
