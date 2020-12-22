package p5;

public class Come implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10000;i++)  {
		System.out.println("come");
	}
	
//	@Override
//	public void run() {
//		while(true) {
//		System.out.println("come");
//	}
//	public void come() {
//		while(true) {
//			System.out.println("come");
//		}
//	}
	}
}