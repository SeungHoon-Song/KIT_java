package p2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		//세수를 입력받아 가장 큰 수를 구하는 프로그램을 조건 연산자를 이용하여 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력:");
		int num2 = sc.nextInt();
		System.out.print("세번째 수 입력:");
		int num3 = sc.nextInt();
		if(num1>=num2&&num1>=num3) {
			System.out.println(num1+","+num2+","+num3+"중 가장 큰 수는 "+num1);
		}
		else if(num2>=num1&&num2>=num3) {
			System.out.println(num1+","+num2+","+num3+"중 가장 큰 수는 "+num2);
		}
		else if(num3>=num1&&num3>=num2) {
			System.out.println(num1+","+num2+","+num3+"중 가장 큰 수는 "+num3);
		}
		else {
			System.out.println("잘못된 수입니다.");
		}
	}

}
