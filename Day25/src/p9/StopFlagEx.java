package p9;

public class StopFlagEx {

	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printThread1.setStop(true);

	}

}

class PrintThread1 extends Thread{
	private boolean stop;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("자원정리 - 열려있는 네트우커ㅡ 로그아웃, 데이터베이스 close, 파일close");
		System.out.println("실행 종료");
	}
}
