package p1;

import java.util.Scanner;

//계산기 클래스
public class Calculator {
	//멤버 필드
	double number1,number2;
	String operator;	//연산자+,-,*,/
	//생성자
	public Calculator() {
		System.out.println("계산기 프로그램");
		System.out.println("Ver 1.0");
		System.out.println("programmer : Song");
	}
	//메소드
	double add() {
		return number1+number2;
	}
	double subtract() {
		//큰것에서 작은 것 빼기
		double result;
		if(number2>number1)
			result=number2-number1;
		else
			result=number1-number2;
		return result;
	}
	double multi() {
		return number1*number2;		
	}
	double divide() {
		//큰것에서 작은것 나누기
		double result=0;
		if(number2>number1 && number1!=0)
			result=number2/number1;
		else if(number2!=0)
			result=number1/number2;
		else
			System.out.println("나누기를 할수 없습니다.");
		return result;
	}
//	void input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계산할 숫자를 입력하세요==>");
//		number1 = sc.nextDouble();
//		System.out.print("연산자(+,-,*,/)를 입력하세요==>");
//		operator = sc.next();
//		System.out.print("계산할 숫자를 입력하세요==>");
//		number2 = sc.nextDouble();
//	}
	void output() {
		
	}
}
