package p2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		//조건연산자를 이용하여 임의의 달을 입력받아 이달이 상반기이면 "상반기입니다"를 
		//하반기이면 "하반기 입니다"를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요:");
		int month = sc.nextInt();
		if(month<13 && month>6) {
			System.out.println("입력하신 "+month+"달은 하반기입니다.");
		}
		else if(month<7 && month>0) {
			System.out.println("입력하신 "+month+"달은 상반기입니다.");
		}
		else {
			System.out.println("잘못된 입력 달입니다.");
		}

	}

}
