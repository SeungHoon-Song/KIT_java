package p2;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		//초를 입력받아 시 분 초로 계산하여 출력하는 프로그램		계산할 초는? 12345	3시간 25분 45초 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요:");
		int sec = sc.nextInt();
		if(sec>=3600) {
			System.out.print(sec/3600+"시간 ");
			sec%=3600;
		}
		if(sec>=60) {
			System.out.print(sec/60+"분 ");
			sec%=60;
		}
		if(sec>0) {
		System.out.println(sec+"초");
		}
		else {
			System.out.println("잘못된 초 입력입니다.");
		}
	}

}
