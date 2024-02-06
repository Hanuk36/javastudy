package com.ict.day11;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Ex11 ex11 = new Ex11();
		System.out.println("main : " + ex11);
		//기본생성자: com.ict.day11.Ex11@7c30a502
		//main : com.ict.day11.Ex11@7c30a502
		
		
		//나만의 실험
		//새로운 객체가 만들어짐
		
		ex11 = new Ex11("가", 1);
		System.out.println("main1 : " + ex11);
		
		//생성자: com.ict.day11.Ex11@3ac3fd8b
		//main1 : com.ict.day11.Ex11@3ac3fd8b
		
		
		
		//*********중요*********
		System.out.println(Ex13.num); //10
		//Ex13, Ex14이랑 상관있는 개념
	}
}
