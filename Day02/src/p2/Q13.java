package p2;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� ��� ���� �� �ְ� ���������� ��� ������ ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		int pencil = sc.nextInt();
		System.out.print("�л� �� �Է�:");
		int student = sc.nextInt();
		int avg = pencil/student;
		int remain = pencil%student;
		System.out.println(pencil+"�ڷ��� ������" +student+"���� �л�����" +avg+"���� ���� �� �ְ�"+remain+"���� ���´�.");
	}

}
