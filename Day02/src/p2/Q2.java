package p2;

import java.util.Scanner;

public class Q2 {
	//입력된 액수만큼 500원, 100원 50원 10원짜리 동전으로 교환해 주는 프로그램을 작성
	//조건 ) 동전의 총개수는 최소화한다
	//고액의 동전을 우선적으로 교환해 준다
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("액수를 입력해주세요:");
		int account = sc.nextInt();
		int c500,c100,c50,c10=10;
		c500=account/500;
		account-=c500*500;
		c100=account/100;
		account-=c100*100;
		c50=account/50;
		account-=c50*50;
		c10=account/10;
		account-=c10*10;
		System.out.println("500원짜리 ==> "+c500+"개");
		System.out.println("100원짜리 ==> "+c100+"개");
		System.out.println("50원짜리 ==> "+c50+"개");
		System.out.println("10원짜리 ==> "+c10+"개");
		System.out.println("바꾸지 못한 잔돈 ==> "+account+"원");

	}

}
