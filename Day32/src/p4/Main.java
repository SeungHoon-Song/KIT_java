package p4;

public class Main {
	public static void main(String[] args) {
		// 익명 구현 객체
		MyFunctionInterface fi1 = new MyFunctionInterface() {

			@Override
			public void method() {
				System.out.println("익명구현 객체로 만든 메소드");

			}
		};
		//익명 구현객체로 만든 메소드 호출하기
		fi1.method();
		// 람다식 표현

		MyFunctionInterface fi2 = () -> // {System.out.println("람다식");};//실행문 안에 구현내용이 1줄이면 {} 생략가능
		System.out.println("람다식");
		
		//람다식으로 만든 메소드 호출하기
		fi2.method();
		
	}// end main()
}// end class
