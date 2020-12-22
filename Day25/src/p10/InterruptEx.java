package p10;

public class InterruptEx {
	
	public static void main(String[] args) {
		PrintThread2 pt = new PrintThread2();	//다형성
		pt.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pt.interrupt();
	}
}
class PrintThread2 extends Thread{
	@Override
	public void run() {
		
		/*방법1
		try {
		while(true) {
			System.out.println("실행 중");
				Thread.sleep(1);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("예외 발생하여 종료!!!!!!!!");;
			}*/
		
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
		
	}
}