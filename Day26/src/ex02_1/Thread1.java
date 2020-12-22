package ex02_1;

public class Thread1 extends Thread{
	private SharedThread st;
	
	public Thread1(SharedThread st) {
		this.st=st;
	}
	@Override
	public void run() {
		while(true)
			st.music();
	}
}
