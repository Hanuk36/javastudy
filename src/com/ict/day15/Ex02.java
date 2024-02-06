package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//개선된 for문. iterator 둫다 알기 <= 그집어 낼때   // iterator <= 순서대로 접근해서 next 로 끄집어 내는거
                                         // [50, 20, 40, 10, 30] 일떄 처음에 50부터가 아니라, 그 밖에서부터 시작해서 50이 있냐고 물어본다.
                                         // 있으면  50 끄집어 내는것
public class Ex02 {
	
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스: HashSet, TreeSet
		// 특징 : 중복불가. 특정기준으로 정렬이 안됨
		//      (단, TreeSet 은 항상 오름차순을 유지한다.)
		//      주머니 주고라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네닉]>();
		//      TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네닉]>();
		
		// 1. 컬랙션 생성
		// 기본 자료형은 못들어감. Integer 라는 클래스로 넣어야 함.
		//HashSet<int> h0 =  new HashSet<int>(); //오류
		
		HashSet<Integer> h1 =  new HashSet<Integer>(); //integer 로 만든 객체를 받음. int 를 받는게 아님.
		TreeSet<Double> h2 = new TreeSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2.컬렉션에 객체 넣기 (add(E e))
				Integer k1 = new Integer(10);
				Integer k2 = new Integer("20");
				
				h1.add(k1);
				h1.add(k2);
				h1.add(new Integer(30));
				h1.add(new Integer("40"));
				// int => Integer => 오토박싱 : 기본자료형을 객체로 변경
				h1.add(50);
				// 바로 String 안됨
				// h1.add("60");
				System.out.println("예: " + h1.add(10));
				
				System.out.println(h1);
				
				// 일반 for문을 사용할 수 없다.
				// for (int i = 0; i < h1.size(); i++) {
				//	  System.out.println(h1[i]);
				// }
				
				// 개선된 for문 사용가능
				for (Integer k : h1) {
					System.out.println(k+1000);
				}
				System.out.println();
				
				Iterator<Integer> it =  h1.iterator();
				while (it.hasNext()) {
					int s = it.next();
					System.out.println(s + 5000);
				}
				
				///////////////////////////////////////////////////
				///////////////////////////////////////////////////
				System.out.println("$========$");
				
				HashSet<Double> d2 = new HashSet<Double>();
				d2.add(10.0);
				d2.add(21.5);
				d2.add(new Double(11.11));
				
				Double t = new Double(12.12);
				d2.add(t);
				
				for(Double k : d2) {
					System.out.println(k);
				}
				
				System.out.println("---------");
				
				Iterator<Double> it2 = d2.iterator();
				while(it2.hasNext()) {
					double d = it2.next();
					System.out.println(d);
				}
				///////////////////////////////////////////////////
				///////////////////////////////////////////////////
				
				
				
				// 오류
				// h2.add(10);
				
				//double d1 = 3.1;
				//double d2 = 10 ;	
	}
}
