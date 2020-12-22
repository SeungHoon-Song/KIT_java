package p2;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇개를 가질 수 있고 최종적으로 몇개가 남는지 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("연필 개수 입력:");
		int pencil = sc.nextInt();
		System.out.print("학생 수 입력:");
		int student = sc.nextInt();
		int avg = pencil/student;
		int remain = pencil%student;
		System.out.println(pencil+"자루의 연필을" +student+"명의 학생들이" +avg+"개를 가질 수 있고"+remain+"개가 남는다.");
	}

}
