package p2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
//		 십의 자리 이하를 버리는 코드 예를 들면 356이며 300이 나올 수 있도록 하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num = sc.nextInt();
		System.out.println("입력한 숫자:"+num);
		if(num>=100) {
			num-=num%100;
			System.out.println("10자리이하를 버린 숫자:"+num);
		}
		else if(num<100 && num>=0){
			num=0;
			System.out.println("10자리이하를 버린 숫자:"+num);
		}
		else {
			System.out.println("잘못된 숫자 범위입니다.");
		}

	}

}
