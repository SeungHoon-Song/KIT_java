package p2;

import java.util.Scanner;

public class OperatorEx01 {
	//�ǽ� 2���� �Է¹޾� ��������ϼ���(+, - , * , /, %)
	public static void main(String[] args) {
		System.out.println(2+3-4);
		System.out.println(2+3*4);
		System.out.println((float)2*3/4);
		System.out.println(4/3);	//��
		System.out.println(4%3);	//������
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		int num2 = sc.nextInt();
		System.out.print("���ϴ� ��ȣ�Է�(+,-,*,/,%):");
		String sym = sc.next();
		if(sym.equals("+")) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(sym.equals("-")) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(sym.equals("*")) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(sym.equals("/")) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		else if(sym.equals("%")) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		}
		else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
	}

}
