package ex01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
//		가위 바위 보 게임 만들기 (switch~case문)
//		실행예시)
//		가위(1), 바위(2) 보(3)중 하나를 입력하세요 --> 1​
//
//		당신은 1입니다.
//		컴퓨터는 1입니다.
//		비겼습니다.​
//
//		가위(1), 바위(2) 보(3)중 하나를 입력하세요 --> 1​
//
//		당신은 1입니다.
//		컴퓨터는 2입니다.
//		컴퓨터 승리입니다.
//
//		힌트) int com = (int) (Math.random() * 3 ) + 1
//		이기는 경우의 수 따지기
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("가위(1), 바위(2) 보(3)중 하나를 입력하세요 -->");
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3 ) + 1;
		
		switch(user) {
		case 1:
			System.out.println("당신은 1입니다.");
			if(com == 1) {
				System.out.println("컴퓨터는 1입니다.");
				System.out.println("비겼습니다.");
			}
			else if(com == 2) {
				System.out.println("컴퓨터는 2입니다.");
				System.out.println("컴퓨터 승리입니다.");
			}
			else {
				System.out.println("컴퓨터는 3입니다.");
				System.out.println("당신 승리입니다.");
			}
			break;
		case 2:
			System.out.println("당신은 2입니다.");
			if(com == 1) {
				System.out.println("컴퓨터는 1입니다.");
				System.out.println("당신 승리입니다.");
			}
			else if(com == 2) {
				System.out.println("컴퓨터는 2입니다.");
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("컴퓨터는 3입니다.");
				System.out.println("컴퓨터 승리입니다.");
			}
			break;
		case 3:
			System.out.println("당신은 3입니다.");
			if(com == 1) {
				System.out.println("컴퓨터는 1입니다.");
				System.out.println("컴퓨터 승리입니다.");
			}
			else if(com == 2) {
				System.out.println("컴퓨터는 2입니다.");
				System.out.println("당신 승리입니다.");
			}
			else {
				System.out.println("컴퓨터는 3입니다.");
				System.out.println("비겼습니다.");
			}
			break;
		default: 
			System.out.println("잘못입력하셨습니다."); 
			break;
		}

	}

}
