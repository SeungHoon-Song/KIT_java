package p3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// ������ ���ڸ� �ϳ� �Է� �ް� 10����, 16����, 8���� ����ϴ� ���α׷�
//		������ �Է��ϼ��� ==> 9999
//		10���� ==> 9999
//		16���� ==> 270F
//		8���� ===> 23417
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int i = sc.nextInt();
		System.out.printf("10���� ==> %d\n",i);
		System.out.printf("16���� ==> %x\n",i);
		System.out.printf("8���� ===> %o\n",i);
		
	}

}
