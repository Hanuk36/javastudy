package com.ict.day07;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//배열: 같은 자료형의 데이터들을 한곳에 모아둔 묶음
		//     ** 같은 자료형이어야 한다.
		//     생성할때 크기를 지정해야 한다. (지정하지 않으면 생성이 안됨)
		//     한번 지정한 크기는 변경이 안됨.
		//     배열 안에 데이터를 가져오기 위해서는 일반적으로 for 문을 사용
		
		//배열 생성 순서: 선언 => 생성 => 초기화 (데이터 저장)
		
		//1.선언 : 자료형 이름[]; 또는 자료형[] 이름;
		int[] su;  // int[] su; 이렇게 해도 됨
		
		//2.생성 : 이름 = new 자료형[배열크기=갯수]
		//  new 예약어 : 메모리에 데이터를 저장할 공간을 만들어 달라.
		//             => 인스턴스, 객체생성
		su = new int[4];
		
		
		//3.데이터 저장 : 이름[index = 위치값 = 0부터 시작]
		//            데이터는 같은 자료형이여야 한다. (프로모션 가능: 작은자료형이 큰자료형으로 변경 가능)
		
		su[0] = 100;
		su[1] = 'a';       // int > char 이기 때문에 프로모션 가능해서 가능.
		su[2] = (int)3.14; // 디모션(강제 형변환) 값은 int 라서 "3"만 저장.
		su[3] = 100;
		
		su[2] = 107;
		
		//배열의 크기를 벗어났다. 
		//su[4] = 107; //여기서는 오류 안나는데, 실행하면 오류난다. 이것을 runtime 오류라고 한다.
		
		//배열 호출하면 주소(생성ID)가 출력
		System.out.println(su);    // [I@58ceff1  <=  주소값이 나옴 
		System.out.println(su[0]); // 100
		System.out.println(su[1]); // 97
		System.out.println(su[2]); // 107 or (3)
		System.out.println(su[3]); // 100
		System.out.println();
	
		
		// 배열의 전체를 출력할때는 for 문 사용
		for(int i = 0 ; i < su.length ; i++) {
			System.out.println(su[i]);
		}
	}	
}