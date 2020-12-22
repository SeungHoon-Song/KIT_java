package ex01;

public class Q09 {

	public static void main(String[] args) {
//		아래와 같이 출력하시오
//		[1, 1] [1, 2] [1, 3] [1, 4] [1, 5]
//		[2, 1] [2, 2] ...................... [2, 5]
//		:
//		[5,1] [5,2][5,3][5,4][5,5]
		
		int i,j;
		for(i=1;i<6;i++) {
			for(j=1;j<6;j++) {
				System.out.print("["+i+", "+j+"] ");
			}
			System.out.println();
		}

	}

}
