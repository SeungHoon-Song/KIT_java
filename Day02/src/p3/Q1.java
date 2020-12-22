package p3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// 정수형 숫자를 하나 입력 받고 10진수, 16진수, 8진수 출력하는 프로그램
//		정수를 입력하세요 ==> 9999
//		10진수 ==> 9999
//		16진수 ==> 270F
//		8진수 ===> 23417
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int i = sc.nextInt();
		System.out.printf("10진수 ==> %d\n",i);
		System.out.printf("16진수 ==> %x\n",i);
		System.out.printf("8진수 ===> %o\n",i);
		
	}

}
