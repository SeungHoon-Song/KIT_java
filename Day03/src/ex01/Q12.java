package ex01;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
//		숫자 맞추기 게임
//		실행 결과
//		1과 100사이의 정수를 입력하세요 ==> 50
//		더 작은 값으로 다시 시도하세요.
//		1과 100사이의 정수를 입력하세요 ==> 25
//		더 작은 값으로 다시 시도하세요.
//		1과 100사이의 정수를 입력하세요 ==> 12
//		더 큰 값으로 다시 시도하세요.
//		1과 100사이의 정수를 입력하세요 ==>21
//		정답입니다.​
//
//		힌트) 컴퓨터가 Math.random( ) 메소드로 임의 값(1~100)을 구해서 사용자의 입력한 값으로 비교해서 반복하여 숫자를 맞는 게임
//		do~while(input != answer)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=숫자 맞추기 게임=");
		int answer = (int) (Math.random() * 100 ) + 1;
		int input;
		do {
		System.out.print("1과 100사이의 정수를 입력하세요 ==> ");
		input = sc.nextInt();
		if(input>0&&input<=100&&input>answer) {
			System.out.println("더 작은 값으로 다시 시도하세요.");
		}
		else if(input>0&&input<=100&&input<answer) {
			System.out.println("더 큰 값으로 다시 시도하세요.");
		}
		else if(input==answer) {
			System.out.println("정답입니다.");
		}
		else {
			System.out.println("1과 100사이의 정수가 아닙니다.");
		}
		}while(input != answer);

	}

}
