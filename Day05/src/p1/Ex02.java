package p1;

public class Ex02 {

	public static void main(String[] args) {
//		1. double 형 배열 real을 선언하면서 값 2.13, 5.71, 2.87, 7.89를 초기화하는 문장
//		2. 1차원 int 배열 ary를 원소 수 12로 선언 및 생성 문장과 세 번째 원소에 10을 저장하는 문장
//		3. int 형 이차원 배열 two를 3행, 4열로 선언 및 생성하는 문장과 2행 3열에 20을 저장하는 문장
//		4. int 형 배열 cnt에서 원소 20개를 생성하여 모든 원소 값이 0이 저장되도록 하는 문장
//		5. int 형 이차원 배열 matrixA에서 다음을 행렬을 초기화하는 문장
//		12 23
//		3 73
//		43 2

		double[] real = {2.13, 5.71, 2.87, 7.89};
		
		int[] arv = new int[12];	arv[2]=10;
		
		int[][] two = new int[3][4]; two[2][3]=20;
		
		int[] cnt = new int[20];
		for(int i=0;i<cnt.length;i++) {
			cnt[i]=0;
		}
		
		int[][] matixA = {{12,23},{3,73},{43,2}};
		
	}

}
