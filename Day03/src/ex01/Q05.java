package ex01;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
//		다음 조건을 만족하는 프로그램을 작성하시오.
//		원금이 1,000,000인 경우, 예치 기간을 1년에서 10년까지 매년 말에 받을 총 금액을 출력
//		년 단위 단리이자 = 원금 * 이율(4.5%) * 년(예치기간)
//		만기 시 총 수령액(년리 적용) = 원금(1+ 이율(4.5%) * 년(예치기간)
		Scanner sc = new Scanner(System.in);
		System.out.print("원금 입력:");
		int money = sc.nextInt();
		System.out.print("예치 기간입력(년단위):");
		int year = sc.nextInt();
		

	}

}
