package p2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		//���ǿ����ڸ� �̿��Ͽ� ������ ���� �Է¹޾� �̴��� ��ݱ��̸� "��ݱ��Դϴ�"�� 
		//�Ϲݱ��̸� "�Ϲݱ� �Դϴ�"�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		int month = sc.nextInt();
		if(month<13 && month>6) {
			System.out.println("�Է��Ͻ� "+month+"���� �Ϲݱ��Դϴ�.");
		}
		else if(month<7 && month>0) {
			System.out.println("�Է��Ͻ� "+month+"���� ��ݱ��Դϴ�.");
		}
		else {
			System.out.println("�߸��� �Է� ���Դϴ�.");
		}

	}

}
