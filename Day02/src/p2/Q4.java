package p2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		//ǥ�� �Է����� �� �Ǽ��� �Է� �޾� ��, ����� ���Ͽ� ����ϴ� ���α׷� �հ� ��� ��� �Ǽ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �Ǽ� �Է�:");
		float num1 = sc.nextFloat();
		System.out.print("�ι�° �Ǽ� �Է�:");
		float num2 = sc.nextFloat();
		float hap=num1+num2;
		float avg=hap/2;
		System.out.println("�Է��Ͻ� �Ǽ�"+num1+"��"+num2+"�� ��:"+hap+"\t���:"+avg);
	}
}
