package p2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
//		 ���� �ڸ� ���ϸ� ������ �ڵ� ���� ��� 356�̸� 300�� ���� �� �ֵ��� �ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num = sc.nextInt();
		System.out.println("�Է��� ����:"+num);
		if(num>=100) {
			num-=num%100;
			System.out.println("10�ڸ����ϸ� ���� ����:"+num);
		}
		else if(num<100 && num>=0){
			num=0;
			System.out.println("10�ڸ����ϸ� ���� ����:"+num);
		}
		else {
			System.out.println("�߸��� ���� �����Դϴ�.");
		}

	}

}
