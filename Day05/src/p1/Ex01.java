package p1;

public class Ex01 {

	public static void main(String[] args) {
		//int temperature[5];	5는 쓸수없다.
		int temperature[];
		
		//int input(3);		()메소드를 뜻한다. 배열[], 배열요소 3은 쓸 수 없다.
		int input[];
		
		//int[3] data = new int[];	크기 지정은 뒤에
		int[] data = new int[3];
		
		//int score[2] = {3.1, 4.5};	소수 double형과 []위치
		double[] score = {3.1,4.5};
		
		//double values[3][4];		//배열요소 쓸 수없다.
		double values[][];
		
		//double[3] eval[4];
		double[] eval[];
		
		//double unit[2][2] = {1.1  2.3  3.4  4.5};	//요소 쓸 수 없다,이중배열 괄호
		double[][] unit = {{1.1,2.3},{3.4,4.5}};
		
		//double price[];
		//price = {2.3, 3.4, 5.6, 2.1};
		double[] price = {2.3, 3.4, 5.6, 2.1};
		
		//double amount[][];
		//amount = {{3.1, 5.4, 7.3}  {4.3}};	이중배열 괄호
		double[][] amount = {{3.1,5.4,7.3},{4.3}};
		
		//double time[2][] = {{6.1, 7.2}, {3.4, 5.6}, {3.9}};
		double[][] time = {{6.1, 7.2}, {3.4, 5.6}, {3.9}};
	}

}
