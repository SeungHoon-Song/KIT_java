package p2;

import java.util.Scanner;

public class Q2 {
	//�Էµ� �׼���ŭ 500��, 100�� 50�� 10��¥�� �������� ��ȯ�� �ִ� ���α׷��� �ۼ�
	//���� ) ������ �Ѱ����� �ּ�ȭ�Ѵ�
	//����� ������ �켱������ ��ȯ�� �ش�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�׼��� �Է����ּ���:");
		int account = sc.nextInt();
		int c500,c100,c50,c10=10;
		c500=account/500;
		account-=c500*500;
		c100=account/100;
		account-=c100*100;
		c50=account/50;
		account-=c50*50;
		c10=account/10;
		account-=c10*10;
		System.out.println("500��¥�� ==> "+c500+"��");
		System.out.println("100��¥�� ==> "+c100+"��");
		System.out.println("50��¥�� ==> "+c50+"��");
		System.out.println("10��¥�� ==> "+c10+"��");
		System.out.println("�ٲ��� ���� �ܵ� ==> "+account+"��");

	}

}
