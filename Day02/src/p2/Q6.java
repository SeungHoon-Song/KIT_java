package p2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		//������ ������ ų�α׷�(kg)�� �Ҽ��� �Է� �޾� �Ŀ��� ����Ͽ� �Ҽ��� 3�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		//1�Ŀ��� 0.453592ų�α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("ų�α׷�(kg) �Է�:");
		float kg = sc.nextFloat();
		float pound = kg/0.453592f;
		System.out.printf("%.3f",pound);

	}

}
