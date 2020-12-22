package p3;

public class TypeInt {

	public static void main(String[] args) {
//		TypeInt클래스
//		정수4종류의 자료형을 모두 선언한 후 초기값을 저장
//		위의 변수를 모두 메소드 printf( )로 호출하여 출력
		
		byte num1=10;
		short num2=20;
		int num3=30;
		long num4=40L;
		
		printfMethod(num1,num2,num3,num4);	//메소드 호출
		System.out.println("함수 호출하고 난후");

	}
	//메소드 정의	byte pnum1=num1	short pnum2=num2 ...
	static void printfMethod(byte pnum1,short pnum2,int pnum3,long pnum4){
		System.out.println(pnum1);
		System.out.println(pnum2);
		System.out.println(pnum3);
		System.out.println(pnum4);
	}


}
