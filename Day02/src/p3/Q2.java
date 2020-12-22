package p3;

public class Q2 {

	public static void main(String[] args) {
//		각 데이터형의 크기를 확인하는 프로그램 작성
//		byte형의 크기 ===> 8
//		short형의 크기 ===> 16
//		int형의 크기 ===> 32
//		long형의 크기 ===> 64
//		float형의 크기 ===> 32
//		double형의 크기 ===> 64
//		char형의 크기 ===> 16
//		힌트 System.out.println("byte형의 크기 \t\n", Byte.SIZE);
		
		//기본형 자료형을 클래스로 만들어 놓을 클래스들이다. 이것을 래퍼클래스(Wrapper class)라고 부른다.
		System.out.println("byte형의 크기 ===>"+Byte.SIZE+"bit");
		System.out.println("short형의 크기 ===>"+Short.SIZE+"bit");
		System.out.println("int형의 크기 ===>"+Integer.SIZE+"bit");
		System.out.println("long형의 크기 ===>"+Long.SIZE+"bit");
		System.out.println("float형의 크기 ===>"+Float.SIZE+"bit");
		System.out.println("double형의 크기 ===>"+Double.SIZE+"bit");
		System.out.println("char형의 크기 ===>"+Character.SIZE+"bit");

	}

}
