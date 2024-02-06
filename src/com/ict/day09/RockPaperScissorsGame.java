package com.ict.day09;

import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		int count         = 0;
		int personWin     = 0;
		int compWin       = 0;
		int tie           = 0;
		String isNotStop  = "";
		String personTurn = "";
		String compTurn   = "";
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("***************");
		System.out.println("가위 바위 보 게임 시작");
		System.out.println("***************");
		
		esc:while(true) {
			
			count++;
			String finalResult ="";
			
			System.out.println("내 차례: 1번=가위, 2번=바위 3번=보");
			int person = scan.nextInt();
			
			switch (person) {
				case 1:
					personTurn = "가위";
					break;
					
				case 2:
					personTurn = "바위";
					break;
				case 3:
					personTurn  = "보";
					break;

				default:
					System.out.println("다시 누르세요");
					continue esc;
			}
			System.out.println(personTurn);
			
			//컴퓨터 차례
			System.out.println("컴퓨터 차례");
			
			int computer = (int)(Math.random() * 3) + 1; 
			System.out.println(computer);
			
			switch (computer) {
				case 1:
					compTurn = "가위";
					break;
				case 2:
					compTurn = "바위";
					break;
				case 3:
					compTurn  = "보";
					break;
			}
			System.out.println(compTurn);

			//사람이 가위를 낼 경우
			if(personTurn.equals("가위")) {
				
				
				if(compTurn.equals("가위")) {
					
					finalResult = "비김";
					tie++;
				}
				else if(compTurn.equals("바위")) {
					
					
					finalResult = "컴퓨터 승";
					compWin++;
				}
				else if(compTurn.equals("보")) {
					
					
					finalResult = "사람 승";
					personWin++;
				}
			}
			
			//사람이 바위를 낼 경우
			else if(personTurn.equals("바위")) {
				
				if(compTurn.equals("가위")) {
						
					
					finalResult = "사람 승";
					personWin++;
					
				}
				else if(compTurn.equals("바위")) {
					
					finalResult = "비김";
					tie++;
				}
				else if(compTurn.equals("보")) {
					
					
					finalResult = "컴퓨터 승";
					compWin++;
				}
			}
			
			//사람이 보를 낼 경우
			else if(personTurn.equals("보")) {
				
				if(compTurn.equals("가위")) {
						
					
					finalResult = "컴퓨터 승";
					compWin++;
					
				}
				else if(compTurn.equals("바위")) {
					
					
					finalResult = "사람 승";
					personWin++;
				}
				else if(compTurn.equals("보")){
		
					finalResult = "비김";
					tie++;
				}
			}

			System.out.println(finalResult);
			
			while(true) {
				
				//게임 다시하기
				System.out.println("게임을 계속 하시겠습니까? Y/N");
				
				isNotStop = scan.next();
				
				if(isNotStop.equalsIgnoreCase("y")) {
					continue esc;
				}
				if(isNotStop.equalsIgnoreCase("n")) {
					break esc;
				}
			
				System.out.println("다시 누르세요");
			}//안 while
		} //밖 while
		
		System.out.println("수고하셨습니다.");
		
		double percentComp = (compWin/(count*1.0)) * 100;
		double percentPerson = (personWin/(count*1.0)) * 100;
		
		System.out.println("총 " + count + " 가위바위보 하였습니다.");
		System.out.println("사람이 이긴 횟수: " + personWin);
		System.out.println("비긴 횟수: " + tie);
		System.out.println("컴퓨터가 이긴 횟수: " + compWin);
		
		System.out.println("컴퓨터의 승률은 " + percentComp);
		System.out.println("사람의 승률은 " + percentPerson);
	}
}