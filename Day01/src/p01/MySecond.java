package p01;

public class MySecond {
	//������ ���� ����� ���ͷ�
	static byte byte_value=-128;	//������ �ʱ�ȭ �ʵ�	-128 ~ +127������ ����ǥ��
	static int int_value=012;	//4����Ʈ �̹Ƿ� -2,147,483,648 ~ +2,147,483,647������ ����ǥ��
	static long long_value=0xadL;// 0x 16���� L longtype
	static char char_value=97;	//�ƽ�Ű�ڵ� ���� ������ �ƽ�Ű �ڵ� ���ڸ� ����Ѵ�.
	static short short_value=100;	//-32768 ~ +32767������ ���� ǥ��
	
	//�Ǽ��� ���� ����� ���ͷ�
	static float float_value = 3.12345678901f,float_value2 = -5.2f;		//�Ǽ��� 4����Ʈ
	static double double_value = 3.1234567890123456,double_value2 = 5E7;		//�Ǽ��� 8����Ʈ �⺻���Դϴ�. �ε��Ҽ��� ǥ�����
	//double���� float���� �Ҽ������ϸ� �󸶳� �����ϰ� ǥ���ϴ����̴�. �Ҽ��� 6�ڸ����� �����ϰ� ǥ�� -float
	//double 16�ڸ������� �����ϰ� ��µǳ� ������ �Ҽ����� �����Ͽ� ó������ ���մϴ�.
	
	//������
	static char char_value1='A';
	static char char_value2='\n'; //�����
	static char char_value3='\t';
	static char char_value4='\'';	// \������ Ư�����ڸ� ����Ϸ��� �� �� ���
	
	
	public static void main(String[] args) {
		
		
		
		System.out.printf("%d\n",byte_value);		//10������ ���
		System.out.printf("%o\n",int_value);		//8������ ���
		System.out.printf("%x\n",long_value);		//16������ ���
		System.out.println(char_value);
		System.out.println(short_value);
		System.out.println(float_value+" "+float_value2);
		System.out.println(double_value+" "+double_value2);
		System.out.println(char_value1+char_value2+"����"+char_value3+char_value4);
		
		
		//���� 32�� ����
	}
}


class Student{
	
}
class Teacher{
	
}