package ex02_1;

public class SharedThreadMain {

	public static void main(String[] args) {
		SharedThread st = new SharedThread();
		
		Thread1 thread1 = new Thread1(st);
		Thread2 thread2 = new Thread2(st);
		
		thread1.setPriority(10);
		thread1.start();
		thread2.start();

	}

}
