package p1;

import java.util.Scanner;

public class Sungjuk {
	//필드 나열
	int number=0;	//번호
	int kor=0;		//국어점수
	int eng=0;		//영어점수
	int total=0;	//합계
	int avg=0;		//평균
	int rank=0;		//등수
	int[][] sungjukArray = new int[7][6];
	
	//생성자
	public Sungjuk(int a,int b){
		
	}
			
	//메소드
	void inputMethod() {
		Scanner sc = new Scanner(System.in);
		//필드에 1개씩 입력을 받아서 2차원 배열에 넣기
		System.out.println("코리아 IT자바반 성적 입력 화면");
		//번호입력 받는 곳
		System.out.println("번호만 먼저 입력하세요.");
		for(int i=0;i<sungjukArray.length-2;i++) {
			number = sc.nextInt();
			sungjukArray[i][0]=number;
		}
		//점수 입력 받는곳
		System.out.println("점수를 입력");
		for(int i=0;i<sungjukArray.length-2;i++) {
			System.out.println(sungjukArray[i][0]+"번호의 사람 점수입력==>");
				System.out.print("국어점수는 ");
				kor = sc.nextInt();
				sungjukArray[i][1] = kor;
				
				System.out.print("영어점수는 ");
				eng = sc.nextInt();
				sungjukArray[i][2] = eng;
		}
		//test();	//배열안에 현재 상황을 보여주는 부분

	}
	int sumMethod() {
		//한명의 점수합계
		for(int i=0;i<sungjukArray.length-2;i++) {
			total=sungjukArray[i][1]+sungjukArray[i][2];
			sungjukArray[i][3]=total;
		}
		test();
		return 0;
	}
	int avgMethod() {
		return 0;
	}
	int rankMethod() {
		return 0;
	}
	void outputMethod() {
		
	}
	int subjectSumMethod() {
		return 0;
	}
	int subjectAvgMethod() {
		return 0;
	}
	void test() {
		for(int i=0;i<sungjukArray.length;i++) {
			for(int j=0;j<sungjukArray[i].length;j++) {
				System.out.printf("%5d",sungjukArray[i][j]);
			}
			System.out.println();
		}
	}//end test()
}//end Class
