package p4;

public class JavaCodeMain {
	
	public static void main(String[] args) {
		//모든 구현객체를 다형성으로 객체화(인스턴스화) 하기
		MyInterface myA = new MyClassA();
		MyInterface myB = new MyClassB();
		MyInterface myC = new MyClassC();
		MyInterface myD = new MyInterface() {	//인터페이스를 객체화하지 못한다. 익명구현객체로 표현한 것
			
			@Override
			public void method1() {
				System.out.println("인스턴스의 메소드");
			}
		};	//익명 구현객체
		myA.method1();
		myA.method2();
		myA.method3();
		System.out.println("----------");
		myB.method1();
		myB.method2();
		myB.method3();
		System.out.println("----------");
		myC.method1();
		myC.method2();
		myC.method3();
		System.out.println("----------");
		myD.method1();
		myD.method2();
		myD.method3();
	}
}
