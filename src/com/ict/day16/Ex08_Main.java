package com.ict.day16;

public class Ex08_Main {
	
	public static void main(String[] args) {
		System.out.println("main: " + Thread.currentThread().getName());
		
		Ex08_TestA testA = new Ex08_TestA();
		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();
		
		testA.start(); // 스래드에서 start() 상속받음
		testB.start();
		testC.start();
		System.out.println("수고하셨습니다."); //JVM 으로 넘어사는데  run() 은 계속 일하고 있다.
	}

}

// 스래드는 start() 와 run() 메서드 두개 있다. 
// Ex08_TestA 는 그것을 상속받았다.
// 메인에서 Ex08_TestA 객체생성을 했다.
// 1. start() 에서 run() 가면은
// 2. start()는 run() 에 일꾼 뿌려주고 
// 3. start()는 다시 메인으로 가서 자기 일한다.
// 4. start() 가 일이 끝나도
// 5. run() 은 계속 자기일 끝날때까지 일한다.