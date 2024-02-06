package com.ict.day04;

public class Ex06 {

	public static void main(String[] args) {
		
		//다중 if 문
		//형식) if(조건식1){
		//         조건식1이 참일때 실행;
		//         조건식1이 참일때 실행;
        //    }else if(조건식2){
		//         조건식1에는 거짓이면서 조건식2에는 참일때 실행;
		//         조건식1에는 거짓이며너 조건식2에는 참일때 실행;
		//    }else if(조건식3){
		//         조건식1과 2에는 거짓이면서 조건식3에는 참일때 실행;
		//         조건식1과 2에는 거짓이면서 조건식3에는 참일때 실행;
		//    }else{
		//         조건식1,2,3 이 모두 거짓인 경우;
		//		   나머지 다
		//    }
		
		//문제
		
		// int k1의 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지 F
		int k1 = 90;
		String result = "";
		
		if (k1 >= 90) {
			result = "A학점";
		} else if (k1 >= 80) {
			result = "B학점";
		} else if (k1 >= 70){
			result = "C학점";
		} else {
			result = "F학점";
		}
		System.out.println("학생 결과: " + result);
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '2';
		String result2 = "";
		
		if(k2 >= 'A' && k2 <= 'Z') {
			result2 = "대문자";
		}else if(k2 >= 'a' && k2 <= 'z'){
			result2 = "소문자";
		}else if(k2 >= '0' && k2 <= '9') {
			result2 = "숫자";
		}else {
			result2 = "기타문자";
		}
		System.out.println("결과2: " + result2);
		
		// char k3가 A, a 이면 아프리카, B,b 이면 브라질, C,c 이면 캐나다 나머지 한국
		
		char k3 = 'C';
		String result3 = "";
		
		if(k3 == 'A' || k3 == 'a') {
			result3 = "아프리카";
		}else if(k3 == 'B' || k3 == 'b') {
			result3 = "브라질";
		}else if(k3 == 'C' || k3 == 'c') {
			result3 = "캐나다";
		}else {
			result3 = "한국";
		}
		System.out.println("결과3: " + result3);
		
		//menu가 1이면 카페모카 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000, 4이면 과일주스 3500 이다.
		// 친구와 2잔을 10000원 내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10%포함., 친구와 같은 음료만 선택)
		
		//나의 답
		int menu = 1;
		int people = 2;
		String result4 = "";
		int money = 10000;
		int cafeMocha = 3500;
		int cafeLatte = 4000;
		int americano = 3000;
		int fruitJuice = 3500;
		int change = 0;
		
		if(menu == 1) {
			result4 = "카페모카";
			change = money - (int)((cafeMocha * 1.1) * people);
			
		}else if(menu == 2) {
			result4 = "카페라테";
			change = money - (int)((cafeLatte * 1.1) * people);
		}
		else if(menu == 3) {
			result4 = "아메리카노";
			change = money - (int)((americano * 1.1) * people);
		}
		else if(menu == 4) {
			result4 = "과일주스";
			change = money - ((int)(fruitJuice * 1.1) * people);
		}
		else {
			result4 = "다시입력";
		}
		System.out.println(result4 + " 잔돈: " + change);
		
		//마지막문제 강사님 답
		int menu1 = 1;
		int input = 10000;
		int su = 2;
		int dan = 0;
		int total = 0;
		int vat = 0;
		int output = 0;
		String drink = "";
		
		if(menu1 == 1) {
			drink = "카페모카";
			dan = 3500;
			
		}else if(menu1 == 2) {
			drink = "카페라테";
			dan = 4000;
		}
		else if(menu1 == 3) {
			drink = "아메리카노";
			dan = 3000;
		}
		else if(menu1 == 4) {
			drink = "과일주스";
			dan = 3500;
		}
		//단가 + 수량
		total = dan * su;
		vat = (int)(total * 0.1);
		output = input - (total + vat);
		
		System.out.println("선택 메뉴 : " + drink);
		System.out.println("지불 금액 : " + input);
		System.out.println("선택 음료 : " + drink);
		System.out.println("음료 단가 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("총 금액 : " + (total + vat));
		System.out.println("잔 돈 : " + output);
	}
}