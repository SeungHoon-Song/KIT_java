package ex02_1;

public class Thread2 extends Thread{
	private SharedThread st;
	
	public Thread2(SharedThread st) {
		this.st = st;
	}
	
	@Override
	public void run() {
		while(true)
			st.video();
	}
}
