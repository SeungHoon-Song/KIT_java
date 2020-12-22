package p2;

import java.util.Scanner;

public class OperatorEx01 {
	//실습 2개를 입력받아 산술연산하세요(+, - , * , /, %)
	public static void main(String[] args) {
		System.out.println(2+3-4);
		System.out.println(2+3*4);
		System.out.println((float)2*3/4);
		System.out.println(4/3);	//몫
		System.out.println(4%3);	//나머지
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2 = sc.nextInt();
		System.out.print("원하는 기호입력(+,-,*,/,%):");
		String sym = sc.next();
		if(sym.equals("+")) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(sym.equals("-")) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(sym.equals("*")) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(sym.equals("/")) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		else if(sym.equals("%")) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		}
		else {
			System.out.println("잘못된 기호입니다.");
		}
	}

}
