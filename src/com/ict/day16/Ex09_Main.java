package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		
		Ex09_testA testA = new Ex09_testA();
		Ex09_testB testB = new Ex09_testB();
		
		//Runnable은 start가 없으므로 사용못함.
		//testA.start();
		
		//Runnable 을 상속받은 클래스를 인자로 널자.
		//testA에 있는 run 을 타켓으로 한다는뜻. 거기로 가라는 뜻
		//이게 첫번째 방법
		Thread t1 = new Thread(testA);
		t1.start();
		
		
		//이게 두번째 방법
		//익명 (선언을 안했음) 선언을 안해서 더이상 못씀.
		new Thread(testB).start();
		
		//이게 세번째 방법
		//익명 안드로이드식.
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111: " + i + Thread.currentThread().getName());		
				}
			}
		}).start();
		
	}

}

//Runnable 에는 start() 없다. run() 만 있다. 
//start() 그래서 상속이 안된다.