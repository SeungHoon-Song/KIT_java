package p1;

public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread autosSaveThread = new AutoSaveThread();
		
		autosSaveThread.setDaemon(true);
		autosSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");

	}

}
