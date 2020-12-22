package ex01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
//		아래와 같이 출력해 보세요.(12345)를 입력 한 것임
//		결과화면
//		숫자를 입력하세요. (예:12345) ==> 12345
//		sum = 5 number = 12345
//		sum = 9 number = 1234
//		sum = 12 number = 123
//		sum = 14 number = 12
//		sum = 15 number = 1
//		각 자리수의 합 : 15
//​
//		힌트) 12345를 문자로 입력 받고 정수형으로 변환한다. Integer.parseInt(number);
//		12345 % 5 = 5
//		12345 / 10 = 1234
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. (예:12345) ==>");
		int sum=0,i,j;
		String number = sc.next();
		i=Integer.parseInt(number);
		for(;;) {
			j=i%10;
			sum+=j;
			if(j==0) {
				sum+=5;
			}
			System.out.println("sum = "+sum+" number = "+i);
			if(i/10==0) {
				System.out.println("각 자리수의 합: "+sum);
				break;
			}
			i/=10;
		}

	}

}
