package p2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		//���� �ϳ��� �µ��� �Ǽ����� �Է� �޾� ���ڰ� F�� f�̸� �Է¹��� ���� ȭ���� �����Ͽ� ������ �ٲٰ� 
		//�Է� ���� ���ڰ� C�� c�̸� �Է¹��� ���� ������ �����Ͽ� ȭ���� �ٲ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//F = (9.0 / 5.0 ) * C + 32
		//C = (5.0 / 9.0 ) * (F - 32)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�:");
		String ch = sc.next();
		System.out.print("�µ�(�Ǽ���) �Է�:");
		float tem = sc.nextFloat();
		float f = (float) ((9.0/5.0)*tem+32);
		float c = (float) ((5.0/9.0)*(tem-32));
		if(ch.equals("F")||ch.equals("f")) {
			System.out.println("ȭ���� �ٲٸ�"+f);
		}
		else if(ch.equals("C")||ch.equals("c")) {
			System.out.println("������ �ٲٸ�"+c);
		}
		else {
			System.out.println("�߸��� ���� �Է��Դϴ�.");
		}

	}

}
