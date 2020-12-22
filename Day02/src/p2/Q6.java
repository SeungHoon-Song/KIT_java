package p2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		//무게의 단위인 킬로그램(kg)을 소수로 입력 받아 파운드로 계산하여 소수점 3자리까지 출력하는 프로그램을 작성하시오. 
		//1파운드는 0.453592킬로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("킬로그램(kg) 입력:");
		float kg = sc.nextFloat();
		float pound = kg/0.453592f;
		System.out.printf("%.3f",pound);

	}

}
