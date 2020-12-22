package p2;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		//Scanner 클래스 - C언어에서 malloc 동적메모리 할당 -- new
		Scanner sc= new Scanner(System.in);//키보드 입력할 수 있는 클래스를 메모리에 올림
		
		System.out.print("정수를 입력하세요");
		int number1 = sc.nextInt();
		System.out.print("실수를 입력하세요");
		float number2 = sc.nextFloat();
		System.out.print("논리형을 입력하세요");
		boolean boolean1 = sc.nextBoolean();
		System.out.print("이름을 입력하세요");
		String name = sc.next();
		//출력하기
		System.out.println("입력한 정수는 "+number1);
		System.out.println("입력한 실수는 "+number2);
		System.out.println("입력한 논리형은 "+boolean1);
		System.out.println("입력한 이름은 "+name);
	}

}
