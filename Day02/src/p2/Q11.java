package p2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// 표준 입력으로 키와 몸무게를 실수로 입력 받아 다음 조건을 이용하여 정상인지, 비만인지 출력하는 프로그램을 작성하시오
		//몸무게 <= (키 - 100) * 0.9  이면 정상 아니면 비만
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력:");
		float height = sc.nextFloat();
		System.out.print("몸무게 입력:");
		float weight = sc.nextFloat();
		if(weight<=(float)((height-100)*0.9)) {
			System.out.println("정상입니다.");
		}
		else {
			System.out.println("비만입니다.");
		}

	}

}
