package p2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// ǥ�� �Է����� Ű�� �����Ը� �Ǽ��� �Է� �޾� ���� ������ �̿��Ͽ� ��������, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//������ <= (Ű - 100) * 0.9  �̸� ���� �ƴϸ� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű �Է�:");
		float height = sc.nextFloat();
		System.out.print("������ �Է�:");
		float weight = sc.nextFloat();
		if(weight<=(float)((height-100)*0.9)) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("���Դϴ�.");
		}

	}

}
