package com.ict.day09;

public class Ex04 {
	
	//저장의 최종단계는 클래스에 저장하는 것
	//인스턴스 필드
	String name = "홍길동";
	int kor = 80;
	int eng = 95;
	int math = 85;
	int total = 0;
	
	//메서드() : 기능, 동작
	//  **해당 메서드를 호출하면 실행 후 호출한 곳으로 되돌아 간다.
	//메서드 형식 : [접근제한자][메서드종류]반환형 메서드이름([인자]){실행할 내용}
	//           일반 메서드는 메서드 종류를 생략한다.
	//           접근제한자 일반적으로 public 을 사용한다.
	//           *** 반환형: 호출한 곳으로 되돌아갈때 가지고 가는 데이터의 자료형
	//                     데이터가 있는 경우는 void 라는 예약어를 사용
	//           반환형이 있는 메서드 맨 마지막 줄에는 return 예약어를 반드시 사용.
	
	//인스턴스 메소드
	public void play01() {
		//System.out.println(2);
		total = kor + eng + math; //전역변수에 저장
		//System.out.println(3);
		
		return;  //구지 쓸 필요 없어서 안씀
	}
	
	public void play02() {
		int sum = kor + eng + math; //지역변수에 저장
	}
	
	//void 가 아닌 메서드에는 반드시 return 값이 있어야 함
	public int play03() {
		int sum = kor + eng + math;
		return sum;
	}
	
	//return 없으면 오류남
	//둘중 아무거나 해도 됨
	public int play04() { 
		
		int sum = kor + eng + math;
		return sum;
		
		//total = kor + eng + math;
		//	return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
