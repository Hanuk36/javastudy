package com.ict.day17;

public class Ex02 implements Runnable{
	
	int x = 0;
	
	// 임계영역이다. dog, cat, tiger, lion 다 같이 사용한다.
	// dog, cat, tiger, lion 쓰레드가 같이 사용하는 영역이다. (임계영역)
	// 임계영역은 일처리를 제대로 하기 전에 다른 스레드에게 제어권을 빼앗길 수 있는 문제점이 있다.
	// 그래서 이러한 문제점을 해결하는 것이 동기화 이다.
	// 동기화란 먼저 차지한 스레드가 끝날때 까지 다른 스레드가 제어권을 빼앗을 수 없게 락을 걸어 버린다.
	// 동기화 방법은 해당 메소드 반환형 앞에 synchronized 라는 예약어를 사용하면 된다.
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println
			(++x + ":" + Thread.currentThread().getName());
		}
	}
}
