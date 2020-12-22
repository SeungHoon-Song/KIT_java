package p7;

public class WorkObject {
	public synchronized void methodA() {
		//임계영역 부분 : 한 스레드만 사용할 수 있는 부분
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
