package p2;

import java.util.Scanner;

public class Q3 {
		public static void main(String[] args) {
			//����) ������ 4�� ������ �������� 100���� ������ �������� ������ �����̴�. 400���� ������ �������� �ص� ���⿡ ���Եȴ�.
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է����ּ���:");
			int year = sc.nextInt();
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println("�Է��� �ش�"+year+"���� �����Դϴ�.");
			}
			else {
				System.out.println("�Է��� �ش�"+year+"���� ������ �ƴմϴ�.");
			}
			
		}
}
