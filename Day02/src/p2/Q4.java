package p2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		//표준 입력으로 두 실수를 입력 받아 합, 평균을 구하여 출력하는 프로그램 합과 평균 모두 실수로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 실수 입력:");
		float num1 = sc.nextFloat();
		System.out.print("두번째 실수 입력:");
		float num2 = sc.nextFloat();
		float hap=num1+num2;
		float avg=hap/2;
		System.out.println("입력하신 실수"+num1+"과"+num2+"의 합:"+hap+"\t평균:"+avg);
	}
}
