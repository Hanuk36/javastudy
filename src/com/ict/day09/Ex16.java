package com.ict.day09;

public class Ex16 {
   
	public static void main(String[] args) {
		
		Ex15 t = new Ex15();
		
		String name = t.play01("둘리");
		System.out.println("name: " + name); //name: 둘리
		System.out.println(t.name); //둘리
		
		
		int res = t.play02(90, 90, 90);
		System.out.println("res: " + res); //res: 270
		System.out.println(t.sum); //0
		
		int res2 = t.play03(80, 80, 80);
		System.out.println("res2: " + res2); //res2: 240
		System.out.println(t.sum); //240
	}
}