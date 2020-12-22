package ex01;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
//		숫자를 계속 입력받는다 0을 입력하면 지금까지 입력한 숫자를 모두 더한 것을 출력한다. 반복문을 이용한 계산하기
//		합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)
//		100 //(입력수)
//		200 //(입력수)
//		300 //(입력수
//		400 //(입력수)
//		0 //(입력수)
//		합계:100 //(출력)
//		힌트) flag를 이용하여 boolean flag=true;로 하고 반복문의 조건을 flag로 한다. 이후 0이 입력되면 flag을 false로 바꾼다.
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");
		int num,total=0;
		while(flag) {
			num = sc.nextInt();
			total+=num;
			if(num==0) {
				System.out.println("합계: "+total);
				flag=false;
			}
		}
		
	}

}
