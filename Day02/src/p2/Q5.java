package p2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		//ǥ�� �Է����� �� �Ǽ��� ��� ������ ��ȯ�Ͽ� �հ� ��� ��� �Ǽ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �Ǽ� �Է�:");
		float num1 = sc.nextFloat();
		System.out.print("�ι�° �Ǽ� �Է�:");
		float num2 = sc.nextFloat();
		int num3 = (int)num1;
		int num4 = (int)num2;
		int hap = num3+num4;
		int avg = hap/2;
		float c_hap = hap;
		float c_avg = avg;
		System.out.println("�Է��Ͻ� �Ǽ��� ������ ��ȯ�ϸ�"+num3+"��"+num4+"�� ��:"+c_hap+"\t���:"+c_avg);
	}

}
