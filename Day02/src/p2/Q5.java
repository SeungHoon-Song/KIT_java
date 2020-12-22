package p2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//표준 입력으로 두 실수를 모두 정수로 변환하여 합과 평균 모두 실수로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 실수 입력:");
		float num1 = sc.nextFloat();
		System.out.print("두번째 실수 입력:");
		float num2 = sc.nextFloat();
		int num3 = (int)num1;
		int num4 = (int)num2;
		int hap = num3+num4;
		int avg = hap/2;
		float c_hap = hap;
		float c_avg = avg;
		System.out.println("입력하신 실수를 정수로 변환하면"+num3+"과"+num4+"의 합:"+c_hap+"\t평균:"+c_avg);
	}

}
