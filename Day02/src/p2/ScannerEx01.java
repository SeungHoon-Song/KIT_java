package p2;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		//Scanner Ŭ���� - C���� malloc �����޸� �Ҵ� -- new
		Scanner sc= new Scanner(System.in);//Ű���� �Է��� �� �ִ� Ŭ������ �޸𸮿� �ø�
		
		System.out.print("������ �Է��ϼ���");
		int number1 = sc.nextInt();
		System.out.print("�Ǽ��� �Է��ϼ���");
		float number2 = sc.nextFloat();
		System.out.print("������ �Է��ϼ���");
		boolean boolean1 = sc.nextBoolean();
		System.out.print("�̸��� �Է��ϼ���");
		String name = sc.next();
		//����ϱ�
		System.out.println("�Է��� ������ "+number1);
		System.out.println("�Է��� �Ǽ��� "+number2);
		System.out.println("�Է��� ������ "+boolean1);
		System.out.println("�Է��� �̸��� "+name);
	}

}
