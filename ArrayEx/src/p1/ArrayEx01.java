package p1;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];		//10 20 30
		int number = 10;
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j] = number;
				number+=10;
			}
		}
		for(int i=0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] arr = new int[][] {{100,200,300},{400,500,600}};
		int[][] arr1 = {{1000,2000,3000},{4000,5000,6000}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//향상된 for로 arr1
		for(int[] farr1:arr1) {
			for(int ffarr1:farr1) {
				System.out.print(ffarr1+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//3차원 배열에 ABCDEF [2][3][3]		참고로 'A' 65입니다.
		char ch = 'A';
		int[][][] arr2 = new int[2][3][2];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				for(int k=0;k<arr2[i][j].length;k++) {
					arr2[i][j][k]= ch;
					ch++;
				}
			}
		}
		int i=0;
		for(int[][]farr2:arr2) {
			System.out.println(i+"면");
			for(int[]ffarr2:farr2) {
				for(int fffarr2:ffarr2) {
					System.out.printf("%c\t",fffarr2);
				}
				System.out.println();
			}
			System.out.println();
			i++;
			
		}
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				for(int k=0;k<arr2[i][j].length;k++) {
//					System.out.print(arr2[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//			
//		}
		
	}	//end main

}	//end class
