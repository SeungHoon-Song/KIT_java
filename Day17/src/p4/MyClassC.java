package p4;
//2030년 코드 method3()
public class MyClassC implements MyInterface{
	@Override
	public void method1() {
		System.out.println("2030년도 코드");
	}
	@Override
	public void method3() {
		MyInterface.stMethod4(); //정적 메소드 사용
	}
	
}
