package p2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		//������ �Է¹޾� ���� ū ���� ���ϴ� ���α׷��� ���� �����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է�:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է�:");
		int num2 = sc.nextInt();
		System.out.print("����° �� �Է�:");
		int num3 = sc.nextInt();
		if(num1>=num2&&num1>=num3) {
			System.out.println(num1+","+num2+","+num3+"�� ���� ū ���� "+num1);
		}
		else if(num2>=num1&&num2>=num3) {
			System.out.println(num1+","+num2+","+num3+"�� ���� ū ���� "+num2);
		}
		else if(num3>=num1&&num3>=num2) {
			System.out.println(num1+","+num2+","+num3+"�� ���� ū ���� "+num3);
		}
		else {
			System.out.println("�߸��� ���Դϴ�.");
		}
	}

}
