package p2;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		//�ʸ� �Է¹޾� �� �� �ʷ� ����Ͽ� ����ϴ� ���α׷�		����� �ʴ�? 12345	3�ð� 25�� 45�� �Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ���:");
		int sec = sc.nextInt();
		if(sec>=3600) {
			System.out.print(sec/3600+"�ð� ");
			sec%=3600;
		}
		if(sec>=60) {
			System.out.print(sec/60+"�� ");
			sec%=60;
		}
		if(sec>0) {
		System.out.println(sec+"��");
		}
		else {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}
	}

}
