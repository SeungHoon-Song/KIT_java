package character;

public class CharTest {

	public static void main(String[] args) {
		// CharTestŬ����
//		��Ű�� character�� ����
//		���������� �ϳ� �����Ͽ� ���� 'B'�� ����
//		���� ������ ���� printBMethod( )�� 2�� ���
		
		char char_value = 'B';	//Ȱ�� ������ �ش��ϴ� �޼ҵ� �ӿ����� ��������
		//printBMethod() ȣ���ϱ�
		printBMethod(char_value);	//�޼ҵ� ȣ���ϱ�
		printBMethod(char_value);

	}
	//�޼ҵ� �����(�����ϱ�) pchar_value = char_value
	static void printBMethod(char pchar_value) {
		System.out.println(pchar_value);
//		System.out.println(char_value);     ���������� ��� �Ұ���
	}

}
