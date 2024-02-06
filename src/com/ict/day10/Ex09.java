package com.ict.day10;

public class Ex09 {
	
	private String name = "";
	private int price = 0;
	
	//getter/setter
	//변수의 접근제한자 private 이므로 외부에서는 접근 불가 하다.
	//내부에서는 접근 가능하다는 부분을 이용해서
	//메서드를 만들어서 접근해서 데이터를 삽입하거나 가져올수 있다.
	
	public void sName(String k) {
		name = k;
	}
	public void sPrice(int k) {
		price = k;
	}
	
	//private 인 name 을 보내주는 역활만 한다.
	public String gName() {
		return name;
	}
	//private 인 price 을 보내주는 역활만 한다.
	public int gPrice() {
		return price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
