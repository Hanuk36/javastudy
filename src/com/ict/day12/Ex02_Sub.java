package com.ict.day12;

import java.util.Random;

//Random 은 API 에서 상속한거다. Ex02 와 아무 상관 없다.
public class Ex02_Sub extends Random {
	
	int su = 0;
	
	//상속받아서 쓴거다. random 이 이미 객체 생성이 되있기 때문이다.
	public void play() {
		su = nextInt(10) + 1;
		System.out.println(su);
	}
}
