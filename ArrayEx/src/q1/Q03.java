package q1;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// 점수배열 - 번호	국어	영어	합계	평균	석차		5번까지
		Scanner sc = new Scanner(System.in);
		int[][] Score = new int[5][6];
		int[] rank = {1,1,1,1,1};
		int kor,eng,sum,avg;
		for(int i=0;i<Score.length;i++) {
			System.out.print((i+1)+"번 국어 점수는? ");
			kor = sc.nextInt();
			System.out.print((i+1)+"번 영어 점수는? ");
			eng = sc.nextInt();
			sum=kor+eng;
			avg=sum/2;
			Score[i][0]=i+1;
			Score[i][1]=kor;
			Score[i][2]=eng;
			Score[i][3]=sum;
			Score[i][4]=avg;
		}
		for(int i=0;i<Score.length;i++) {
			for (int j = 0; j < Score.length; j++) {
				if(Score[i][3]<Score[j][3]) {
					rank[i]++;
				}				
			}
		}
		for(int i=0;i<Score.length;i++) {
		System.out.println((i+1)+"번\t국어:"+Score[i][1]+"\t영어:"+Score[i][2]+"\t합계:"+Score[i][3]+"\t평균:"+Score[i][4]+"\t석차:"+rank[i]);
		}
	}

}
