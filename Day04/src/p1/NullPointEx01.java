package p1;

public class NullPointEx01 {

	public static void main(String[] args) {
		//참조변수(배열,열거형,클래스,인터페이스) 선언
		Student st;
		InterStudent ist;		
		int[] arr;
		
		//참조변수의 초기값을 넣기
		Student st1 = null;
		InterStudent ist1 = null;
		int[] arr1 = null;
		
		//NullPointerException 발생하는 예
		int[] intArray = null;
		intArray = new int[5];
		intArray[0] = 10;	//null로 가르키는 곳이 없어서 NullPointerException
		System.out.println(intArray[0]);
		
//		String str = null;
//		str = "코리아It";
//		System.out.println("총문자수 : "+str.length());	//NullPointerException
	
	}

}
class Student{
	
}
interface InterStudent{
	
}
