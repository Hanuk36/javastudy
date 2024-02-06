package com.ict.ahomework;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int gameRound = 0;
		int finalOutCount = 0;
		int[] comp = new int[3];
		int[] player = new int[3];

		// 컴퓨터 3개 볼 던지는 코드
		System.out.println("컴퓨터가 먼저 던집니다");
		for (int i = 0; i < comp.length; i++) {
			comp[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (comp[i] == comp[j]) {
					i--;
				}
			}
		}
		// 컴퓨터가 던진 숫자출력코드
		// System.out.print(comp[0]);
		// System.out.print(comp[1]);
		// System.out.print(comp[2] + "\n");
		System.out.println("컴퓨터가 던졌습니다. 맞춰보세요 0-9까지 중복되지 않게 번호 3개를 고르세요");
		System.out.println("Player 차례입니다.");

		exit: while (gameRound < 10) {

			gameRound++;
			System.out.println(gameRound + "번째 게임입니다.");
			int outCount = 0;
			int strikeCount = 0;
			int ballCount = 0;

			// 내가 3개 볼 던지는 코드
			for (int i = 0; i < player.length; i++) {
				int playerBall = scan.nextInt();
				player[i] = playerBall;

				for (int j = 0; j < i; j++) {
					if (player[i] == player[j]) {
						System.out.println("중복된 번호입니다. 다시 고르세요");
						i--;
					}
				}
			}
			System.out.print(player[0]);
			System.out.print(player[1]);
			System.out.print(player[2]);

			for (int i = 0; i < comp.length; i++) {
				for (int j = 0; j < player.length; j++) {
					if (comp[i] != player[j]) {
						outCount++;
						if (outCount == 9) {
							finalOutCount++;
							if (finalOutCount == 3) {
								System.out.println("3 아웃 게임 종료");
								break exit; // 3 아웃 게임 종료
							}
						}
					} else if (i == j && comp[i] == player[j]) {
						strikeCount++;
						if (strikeCount == 3) {
							System.out.println("3 스트라이크: player 승! 게임 종료!");
							break exit; // 3 스트라이크 게임 종료
						}
					} else if (i != j && comp[i] == player[j]) {
						ballCount++;
					}
				}
			}
			System.out.println();
			System.out.print(strikeCount + "스트라이크" + " || ");
			System.out.print(ballCount + "볼" + " || ");
			System.out.print(finalOutCount + "아웃" + "\n");
		}
		System.out.println(gameRound + "으로 게임종료 되었습니다.");
	}
}