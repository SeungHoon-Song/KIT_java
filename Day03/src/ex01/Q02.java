package ex01;

public class Q02 {

	public static void main(String[] args) {
//		다음을 출력하는 프로그램을 중첩된 for문을 이용하여 작성하시오
//		힌트 ) Math.abs( ) : 절대값을 구하는 매소드 예) -7이면 7
//		int i, j;
//		final int MAX = 7;
//		for (i = 0; i <= MAX; i++)
//		{
//		for (j = MAX; j >= -MAX; j--)
//		{
//		if (Math.abs(j) > i) System.out.print(' ');
//		else System.out.printf("%d", Math.abs(j));
//		}
//		System.out.println();
//		}
		
		int i,j; //  i는 행의 첨자 변수,j는 열의 첨자 변수
		int maxValue = 8;
		for(i=0;i<maxValue;i++) {
			for(j=maxValue;j>=-maxValue;j--) { //7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
				if(Math.abs(j)>i) System.out.print(' ');
				else System.out.printf("%d",Math.abs(j));
			}
			System.out.println();
		}
	}

}
