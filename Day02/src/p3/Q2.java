package p3;

public class Q2 {

	public static void main(String[] args) {
//		�� ���������� ũ�⸦ Ȯ���ϴ� ���α׷� �ۼ�
//		byte���� ũ�� ===> 8
//		short���� ũ�� ===> 16
//		int���� ũ�� ===> 32
//		long���� ũ�� ===> 64
//		float���� ũ�� ===> 32
//		double���� ũ�� ===> 64
//		char���� ũ�� ===> 16
//		��Ʈ System.out.println("byte���� ũ�� \t\n", Byte.SIZE);
		
		//�⺻�� �ڷ����� Ŭ������ ����� ���� Ŭ�������̴�. �̰��� ����Ŭ����(Wrapper class)��� �θ���.
		System.out.println("byte���� ũ�� ===>"+Byte.SIZE+"bit");
		System.out.println("short���� ũ�� ===>"+Short.SIZE+"bit");
		System.out.println("int���� ũ�� ===>"+Integer.SIZE+"bit");
		System.out.println("long���� ũ�� ===>"+Long.SIZE+"bit");
		System.out.println("float���� ũ�� ===>"+Float.SIZE+"bit");
		System.out.println("double���� ũ�� ===>"+Double.SIZE+"bit");
		System.out.println("char���� ũ�� ===>"+Character.SIZE+"bit");

	}

}
