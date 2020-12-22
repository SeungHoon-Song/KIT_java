package p2;

public class MainThreadEx {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();	//스레드의 NEW 상태 - 접수
		user1.setCalculator(calculator);
		user1.start();	//스레드의 RUNNABLE 상태 - 간호사
		//--> 스케쥴러 (운영체제) --> cpu(core,process) 넣기 RUNNING - 의사진료 --> Dead 처방전 끝 
		
		//일시정지 -xray 촬영
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}
}
