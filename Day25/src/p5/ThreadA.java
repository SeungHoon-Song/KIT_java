package p5;

public class ThreadA extends Thread{
	public boolean stop=false;
	public boolean work=true;
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작동");
			}else {
				System.out.println("ThreadA yield함!~");
				Thread.yield();	//work작업 할 수 없으므로 다른 스레드에게 양보함
			}
		}
		System.out.println("ThreadA 종료");
	}

}
