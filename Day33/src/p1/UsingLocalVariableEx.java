package p1;

public class UsingLocalVariableEx {

	public static void method(final int arg) {
		final int localVar = 40; // 로컬변수
//		localVar += 100;
//		arg -= 100;

		// 람다식 구조 인터페이스명 변수 = () -> {...};
		MyFunctionInterface fi = () -> {
			System.out.println("arg " + arg);
			System.out.println("localVar : "+localVar);
		};
		
		fi.method1();//람다식으로 선언한 함수(메소드를) 호출함
	}//method() end

	public static void main(String[] args) {
		
		method(500);
		
	}

}
