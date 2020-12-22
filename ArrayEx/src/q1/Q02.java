package q1;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// 10개의 실수를 입력 받아서 배열에 넣고 최대값과 최소값을 구하여 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("10개의 실수 입력 :");
		double[] DArr = new double[10];
		double max=-9999,min=9999;
		for(int i=0;i<DArr.length;i++) {
		double num = sc.nextDouble();
		DArr[i]=num;
		if(max<DArr[i]) {
			max=DArr[i];
		}
		if(min>DArr[i]) {
			min=DArr[i];
		}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}
