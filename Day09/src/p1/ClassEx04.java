package p1;

import java.util.Scanner;

public class ClassEx04 {

	public static void main(String[] args) {
		//객체화(인스턴스화)
		Calculator cal = new Calculator();
		//입력하기		1.객체화하기
		InputClass inputClass = new InputClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수 계산, 2. 실수 계산, 3.문자 연결");
		System.out.print("번호를 고르세요:");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				break;
		}
		
		//연산자 분기시키기
		double result=0;
		switch(cal.operator) {
		case "+":
			result = cal.add();
			break;
		case "-":
			result = cal.subtract();
			break;
		case "*":
			result = cal.multi();
			break;
		case "/":
			result = cal.divide();
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
		System.out.println(result);
	}

}
