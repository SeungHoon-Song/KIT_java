package p2;

import java.util.Scanner;

public class Q3 {
		public static void main(String[] args) {
			//조건) 윤년은 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다. 400으로 나누어 떨어지는 해도 윤년에 포함된다.
			Scanner sc = new Scanner(System.in);
			System.out.print("년을 입력해주세요:");
			int year = sc.nextInt();
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println("입력한 해당"+year+"년은 윤년입니다.");
			}
			else {
				System.out.println("입력한 해당"+year+"년은 윤년이 아닙니다.");
			}
			
		}
}
