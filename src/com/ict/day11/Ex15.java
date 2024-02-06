package com.ict.day11;

public class Ex15 {
	
	//static 초기화
	/*
	    static{
	  	   초기화 내용;
	  	}
	*/
	
	int s1 = 100;
	private int p1 = 300;
	static int s2; //애초에 초기값이 위치가 들어간다
	static int s3; //초기값 자체가 없다
	
	public static int k2 = 300; //기존에 값이 있는데 바뀐다.
	static int k3 = 300;
	private static int k4 = 500;
	
	//초기화 블럭의 위치에 따라 달라진다.
	//위에 있는 애들이 바껴진다.(위에것만 설정해준다)
	//밑에 있는 애들이 안바껴진다.
	static {
		k2 = 20000;
		s2 = 50000;
		j2 = 40000;
		m2 = 60000;
	}
	//m2는 위에것 가지고 온다. ******m2가 가장 헷깔리는 부분이다.******
	static int m2; //밑에 있는데 선언만 된애는 위에서 값을 가지고 온다.
	static int j2 = 400; //초기값 넣었다가 다시 400으로 바꾼것이다.
	

}
