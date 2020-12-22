package ex01;

public class Music extends Thread{
	@Override
	public void run() {
		while(true)
		System.out.println("음악을 재생합니다.");

	}
}