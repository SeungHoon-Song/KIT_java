package p5;

public class Go implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("Go!!");
		}
		
	}
	
//	@Override
//	public void run() {	//스레드로 처리할 내용을 작성
//		while(true) {
//		System.out.println("Go!!");
//		}
//	}
//	
//	public void go(){
//		while(true) {
//			System.out.println("Go!!");
//		}
//	}
}
