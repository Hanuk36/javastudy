package com.ict.day10;

public class Ex01 {
	
	public int add(int k) {
		//메서드 인자를 기본자료형의 값은 인자로 전달 하면 
		//값 호출 (call by value)라 부른다.
		//원본값은 변하지 않는다.
		++k;
		return k;
	}
	//메서드의 인자를 배열이나 객체를 인자로 
	//전달하면 참조호출이라 한다(call by reference)
	//원본값이 변한다.
	public void add2(int[] k) {
		//받은 배열을 하나씩 꺼내서 10씩 증가 하자.
		for (int i = 0; i < k.length; i++) {
			k[i] = k[i] + 10;  //k[i] += 10;
		}
	}

}
