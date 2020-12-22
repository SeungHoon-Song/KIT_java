package p2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		//문자 하나와 온도를 실수형을 입력 받아 문자가 F나 f이면 입력받은 값을 화씨로 간주하여 섭씨로 바꾸고 
		//입력 받은 문자가 C나 c이면 입력받은 값을 섭씨로 간주하여 화씨로 바꿔 결과를 출력하는 프로그램을 작성하시오.
		//F = (9.0 / 5.0 ) * C + 32
		//C = (5.0 / 9.0 ) * (F - 32)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력:");
		String ch = sc.next();
		System.out.print("온도(실수형) 입력:");
		float tem = sc.nextFloat();
		float f = (float) ((9.0/5.0)*tem+32);
		float c = (float) ((5.0/9.0)*(tem-32));
		if(ch.equals("F")||ch.equals("f")) {
			System.out.println("화씨로 바꾸면"+f);
		}
		else if(ch.equals("C")||ch.equals("c")) {
			System.out.println("섭씨로 바꾸면"+c);
		}
		else {
			System.out.println("잘못된 문자 입력입니다.");
		}

	}

}
