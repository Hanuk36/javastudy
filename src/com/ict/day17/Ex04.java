package com.ict.day17;


//두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~100 까지 출력하고,
//두번째 스레드가 출력을 101에서 200까지 출력하라.(당연히 synchronized 사용)
public class Ex04 implements Runnable {
	int x = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println
			(Thread.currentThread().getName() + ":" + ++x);
		}
	}
	
	// 이 방법을 써도 됨. 결과는 같음.
//	@Override
//	public void run() {
//		synchronized (this) {
//			for (int i = 0; i < 100; i++) {
//				System.out.println
//				(Thread.currentThread().getName() + ":" + ++x);
//			}
//		}
//	}
}
