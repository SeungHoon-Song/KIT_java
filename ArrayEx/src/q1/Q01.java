package q1;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
//		배열의 모든 요소를 더해서 총점과 평균을 구하기
//		10개의 정수를 입력 받아서 배열에 넣고 총점과 평균을 구하여 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 정수 입력: ");
		int sum=0;
		double avg=0;
		int[] intArr = new int[10];
		for(int i=0;i<intArr.length;i++) {
		int num = sc.nextInt();
		intArr[i]=num;
		sum+=intArr[i];
		}
		avg=sum/10;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
