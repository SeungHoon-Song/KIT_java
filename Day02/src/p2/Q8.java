package p2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		//õ�� ������ ���� �ϳ��� �Է� �޾� �츮�� ����ϴ� ������ ��, õ, ��, ��, �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//��, �Է��� 2347653�̸� "234�� 7õ 6�� 5�� 3�Դϴ�."�� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("õ�� ������ ���� �Է�:");
		int i = sc.nextInt();
		
		if(i>9999) {
			System.out.print(i/10000+"�� ");
			i%=10000;
		}
		if(i>999) {
			System.out.print(i/1000+"õ ");
			i%=1000;
		}
		if(i>99) {
			System.out.print(i/100+"�� ");
			i%=100;
		}
		if(i>9) {
			System.out.print(i/10+"�� ");
			i%=10;
		}
		System.out.print(i+"�Դϴ�.");

	}

}
