package p4;

public interface MyInterface {
	public void method1();	//2010년~2019년 구현 클래스 공통 2020~
	default public void method2() {
		System.out.println("2020년도 이후에 구현 클래스 공통");
	}	//2020년도 이후에 구현 클래스 공통
	default public void method3() {
		System.out.println("2030년도 이후에 구현 클래스 공통");
	}
	static void stMethod4() {	//2030년 이후 새로운 메소드
		System.out.println("정적 메소드");
	}
}
