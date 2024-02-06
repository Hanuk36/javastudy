package com.ict.day17;

public class Ex05 implements Runnable  {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) { //하나의 쓰레드가 100번을 돈다는 의미
			System.out.println(++x + ":" + Thread.currentThread().getName());
			
			//if(x == 50 || x == 100) {
			if(x % 50 == 0) {    // 50씩 끊긴다는 개념
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify(); // else 없이 이렇게 해도 된다.
//			else {
//				notify();
//			}
		}
	}
}