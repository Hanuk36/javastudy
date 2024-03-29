package com.ict.day11;

import java.util.Scanner;
//Ex06이랑 한묶음
public class Ex05 {
	
	public static void main(String[] args) {
		
		//set 을 이용해서 맴버필드값을 변경했던것을
		//생성자를 이용해서 변경하자
		Ex06 coff = new Ex06("커피음료", 1500);
		//coff.sName("커피음료");
		//coff.sPrice(1500);
		
		Ex06 ion = new Ex06("이온음료", 2300);
		//ion.sName("이온음료");
		//ion.sPrice(2300);
		
		Ex06 cola = new Ex06("탄산음료", 2000);
		//cola.sName("탄산음료");
		//cola.sPrice(2000);
		
		Ex06 juice = new Ex06("과일음료", 1800);
		//juice.sName("과일음료");
		//juice.sPrice(1800);
		
		Ex06[] arr = {coff, ion, cola, juice};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		int output = 0;
		//1. 1500을 직접 입력하지 말고 비교해서 넣자
		//2. 살수없는 제품을 선택하면 - 계산이 안된다. (살수 없다고 표기하고 다시 메뉴가 나와야 된다.)
		
		esc:while(true) {
				
				System.out.println("남은 돈 : " + input);
				if(input < 1500) {
					output = input;
					break esc;
				}
				else {
					System.out.println("커피\t이온\t탄산\t과일\t반환");
					for (int i = 0; i < arr.length; i++) {
						if(arr[i].gPrice() <= input) {
							System.out.print("0\t");
						}else {
							System.out.print("X\t");
						}
					}
					System.out.println();
					String order = "";
					System.out.println("선택하세요 >>");
					String drink = scan.next();
					switch(drink) {
						case "커피" :
							if(input < coff.gPrice()) {
								System.out.println("돈이 부족합니다.");
							}
							output = input - arr[0].gPrice();
							order = drink + " 를 주문하셨고 잔돈은 " 
							               + output + " 원 입니다.";
							break;
						case "이온" :
							if(input < ion.gPrice()) {
								System.out.println("돈이 부족합니다.");
							}
							output = input - arr[1].gPrice();
							order = drink + " 를 주문하셨고 잔돈은 " 
						               + output + " 원 입니다.";
							break;
						case "탄산" :
							if(input < cola.gPrice()) {
								System.out.println("돈이 부족합니다.");
							}
							output = input - arr[2].gPrice();
							order = drink + " 를 주문하셨고 잔돈은 " 
						               + output + " 원 입니다.";
							break;
						case "과일" :
							if(input < juice.gPrice()) {
								System.out.println("돈이 부족합니다.");
							}
							output = input - arr[3].gPrice();
							order = drink + " 를 주문하셨고 잔돈은 " 
						               + output + " 원 입니다.";
							break;
						case "반환" :
							output = input;
							break esc;
						default :
							System.out.println("잘못된 입력, 다시 누르세요");
							continue;
					}
					System.out.println(order);
				}
				//잔돈을 물걸을 살수 있는 input 으로 전환
				input = output;  // 키포인트 이부분이 중요
				if(input >= coff.gPrice() || input >= ion.gPrice() ||
				   input >= cola.gPrice() || input >= juice.gPrice()) {
					
					System.out.println("다시 구매하시겠습니다? y/n");
					String buyAgain = scan.next();
					
					if(buyAgain.equalsIgnoreCase("y")) {
						continue esc;
					}
					else if(buyAgain.equalsIgnoreCase("n")){
						break esc;
					}
					else {
						System.out.println("y/n 에서만 누르세요");
					}
				}
				
		}//밖 while
		System.out.println("잔돈: " + output + " 가져가세요");	
		
	}
}