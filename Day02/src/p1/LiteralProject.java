package p1;
//���������� '\n'
public class LiteralProject {

	public static void main(String[] args) {
		char char_value1 = 'A';
		char char_value2 = '\n';
		char char_value3 = '\t';
		
		/*System.out.print(char_value1);
		System.out.print(char_value2);
		System.out.print(char_value3);
		System.out.print("B");
		
		System.out.printf("%c %c %c %c",char_value1,char_value2,char_value3,'B');*/
		
		//System.out.print(char_value1+char_value2+char_value3+'B');
		
		//System.out.println(); �ȿ� +��ȣ�� ���� ����
		//�ƽ�Ű�ڵ�� 'A' \n \t 'B'	65 10 9  66
		int a = 10;
		int b = 20;
		String word="songseunghoon";
		String word2="Hi!";
		System.out.println(a+b+word+(a+b));
		//������ + ������ = ���ڿ��� + ������ = ������
		System.out.println(word2+" "+word);
		
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		boolean1 = 100<110;
		boolean2 = true && true;
		System.out.println(boolean1 + " "+ boolean2);
		//�ڷ��� �⺻��:������-byte,short,int,long,�Ǽ���-float,double,������-char,����-boolean 
		//�ڷ��� ������:String(������������ �⺻���� ������ ����� ���� �� �ִ�.)
		
		//���ͷ� ����: 10����-123, 8����-056 , 16����-0xAF, �Ǽ���-�Ҽ���3.14f , ������0.3E-7
		//���ͷ� ������-'A' '\n' ,����-true false ���ڿ�-"korea"
		

	}

}
