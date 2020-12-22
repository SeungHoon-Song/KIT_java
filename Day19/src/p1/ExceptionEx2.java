package p1;

public class ExceptionEx2 {
	public static void main(String[] args){
		try {
		method1();
		method2();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		System.out.println("데이터베이스 종료");
		System.out.println("로그아웃");
		}
		
	}

	private static void method2() throws Exception{
		a();
	}

	private static void a() throws ArithmeticException,ArrayIndexOutOfBoundsException{
		b();
		int[] arr = new int[5];
		arr[5]=10;
		
	}

	private static void b() throws ArithmeticException{
		int a = 10;
		int c = a/2;	//예외발생
	}

	private static void method1() {
		
	}
	
}
