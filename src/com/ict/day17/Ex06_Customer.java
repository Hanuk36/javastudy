package com.ict.day17;

//차 사는 고객
public class Ex06_Customer implements Runnable {
	
	private Ex06_Car car;
	public Ex06_Customer(Ex06_Car car) {
		this.car = car; //사고자 라는 차를 받는다.
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.pop();		
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
