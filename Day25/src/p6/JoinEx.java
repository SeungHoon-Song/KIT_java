package p6;

public class JoinEx {
	
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		//워드 프로그램 실행
		try {
			sumThread.join();	//join() 수행하는 중 interrupt() 메소드가 호출되면 예외발생
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("합 : "+sumThread.getSum());
		
	}
}
