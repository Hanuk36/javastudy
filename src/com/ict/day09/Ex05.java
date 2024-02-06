package com.ict.day09;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//Ex04 클래스를 객체로 만들어야
		//Ex04 가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		//Ex04 클래스를 객체로 만들기
		Ex04 t = new Ex04(); //기본생성자
		
		System.out.println(t.name);
	
		//Ex04 에 있는 play01 메서드를 호출하자.
		//play01() 이 void 이기 때문에 데이터를 가져오지는 않는다.
		
		//여기서 내가 호출. 
		//Ex04 클라스에 있는 메서드로 가서 결과값 산출. 
		//그리고 다시 여기로 홈
		
		
	    //System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
		//System.out.println(4);
		
		//지역변수라 실행이 끝나고 돌아올때 int sum 값이 없어진다.
		t.play02();
		//System.out.println(t.sum);
		
		
		System.out.println("---");
		int k = t.play03(); //반환형이 있으면 그 반환형값 저장
		System.out.println(k);
		
		
		
		System.out.println("***");
		t.play04();
		System.out.println(t.play04());
		
		
		
		
	}
}
