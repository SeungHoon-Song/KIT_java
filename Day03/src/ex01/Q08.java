package ex01;

public class Q08 {

	public static void main(String[] args) {
		// 8. 구구단 출력하기
		//2 X 1 = 2 3 X 1 = 3 ........ 9 X 1 = 9
//		:
//		2 X 9 = 18 3 X 9 = 27 ...... 9 X 9 = 81
		
		int i,dan;
		for(i=1;i<10;i++) {
			for(dan=2;dan<10;dan++) {
				System.out.print(dan+" X "+i+" = "+dan*i+"\t");
			}
			System.out.println();
		}
		
		
		//2 X 1 = 2	2 X 2 = 4	...	2 X 9 = 18
		//		:
		//9 X 1 = 9	9 X 2 = 18	...	9 X 9 = 81
		
//		int i,dan;
//		for(dan=2;dan<10;dan++) {
//			for(i=1;i<10;i++) {
//				System.out.print(dan+" X "+i+" = "+dan*i+"\t");
//			}
//			System.out.println();
//		}

	}

}
