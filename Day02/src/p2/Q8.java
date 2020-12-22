package p2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		//천만 이하의 정수 하나를 입력 받아 우리가 사용하는 단위인 만, 천, 백, 십, 일 단위로 출력하는 프로그램을 작성하시오
		//즉, 입력이 2347653이면 "234만 7천 6백 5십 3입니다."로 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("천만 이하의 정수 입력:");
		int i = sc.nextInt();
		
		if(i>9999) {
			System.out.print(i/10000+"만 ");
			i%=10000;
		}
		if(i>999) {
			System.out.print(i/1000+"천 ");
			i%=1000;
		}
		if(i>99) {
			System.out.print(i/100+"백 ");
			i%=100;
		}
		if(i>9) {
			System.out.print(i/10+"십 ");
			i%=10;
		}
		System.out.print(i+"입니다.");

	}

}
