package p4;

public class UtilEx {

	public static void main(String[] args) {
		int result1 = Util.compare(200, 100);
		System.out.println(result1);
		
		double result2 = Util.compare(2.2, 3.3);
		System.out.println(result2);	//-1
		
		//Util.compare("a", "b");	<T extends Number> 제네릭 T는 숫자의 하위클래스 넣어야 함
	}

}
