package p5;

public class YeildEx {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();	//스레드의 NEW상태
		ThreadB threadB = new ThreadB();
		
		threadA.start();	//RUNNABLE 상태
		threadB.start();	
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work=false;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work=true;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated 
			catch block
			e.printStackTrace();
		}
		threadA.stop=true;
		threadB.stop=true;
	}

}
