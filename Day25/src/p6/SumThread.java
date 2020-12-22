package p6;

public class SumThread extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			sum+=i;
			//워드 자동저장하는 프로그램 10분이되면
		}
	}

}
