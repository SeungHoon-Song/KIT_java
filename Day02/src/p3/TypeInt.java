package p3;

public class TypeInt {

	public static void main(String[] args) {
//		TypeIntŬ����
//		����4������ �ڷ����� ��� ������ �� �ʱⰪ�� ����
//		���� ������ ��� �޼ҵ� printf( )�� ȣ���Ͽ� ���
		
		byte num1=10;
		short num2=20;
		int num3=30;
		long num4=40L;
		
		printfMethod(num1,num2,num3,num4);	//�޼ҵ� ȣ��
		System.out.println("�Լ� ȣ���ϰ� ����");

	}
	//�޼ҵ� ����	byte pnum1=num1	short pnum2=num2 ...
	static void printfMethod(byte pnum1,short pnum2,int pnum3,long pnum4){
		System.out.println(pnum1);
		System.out.println(pnum2);
		System.out.println(pnum3);
		System.out.println(pnum4);
	}


}
