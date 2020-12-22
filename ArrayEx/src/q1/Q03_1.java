package q1;

import java.util.Scanner;

public class Q03_1 {

	public static void main(String[] args) {
		int[][] student = new int[7][6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<student.length-2;i++) {
			System.out.println(i+1 + "번째 사람 입력순서는 번호 국어점수 영어점수 입력");
			student[i][0] = i+1;
			for(int j=1;j<student[i].length-3;j++) {
				student[i][j] = sc.nextInt();	//점수 입력
				student[i][3] += student[i][j]; //합계 누적
				student[5][j] += student[i][j];	//과목별 합계
			}
			student[i][4] = student[i][3]/2;
		}//end for
		//과목 평균 구하기
		for(int i=0;i<student.length-1;i++) {
			student[6][i] = student[5][i]/(student.length-1);
		}
		
		//등수 구하기
		for(int i=0;i<student.length-2;i++) {
			student[i][5]=1;
			for(int j=0;j<student.length;j++) {
				if(student[i][3]<student[j][3])
					student[i][5]++;
			}
		}
		
		
		//출력하기
		for(int i=0;i<student.length;i++) {
			for(int j=0; j<student[i].length;j++) {
				System.out.printf("%5d",student[i][j]);
			}
			System.out.println();
		}
		
	}
}

