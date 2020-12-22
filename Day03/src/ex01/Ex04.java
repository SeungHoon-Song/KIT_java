package ex01;

public class Ex04 {

	public static void main(String[] args) {
		//향상된 for문 설명
		int [] number = {1,2,3,4,5};
		double [] dnumber = {1.1,3.3,6.6,7.7};
		for(int n_value : number) {
			System.out.println(n_value);
		}
		//출력하기
		for(double d_number : dnumber) {
			System.out.println(d_number);
		}

	}

}
