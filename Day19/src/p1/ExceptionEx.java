package p1;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 10;
		try {
		int[] arr = new int[5];
		arr[5]=30; //예외가 발생하면 아랫부분이 수행되지 않는다.
		int c = a/0;
	
		}catch(ArithmeticException e) {
			System.out.println("산술적 오류");
		}catch(Exception e) {
			System.out.println("모든 예외 처리");
		}
		finally {	//catch로 예외 못잡더래도 반드시 해주는 코드작성
			System.out.println("DB닫기");
			System.out.println("연결된 자원 해제");
		}		
	}

}
