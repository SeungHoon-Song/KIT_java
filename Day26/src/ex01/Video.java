package ex01;

public class Video extends Thread{
	@Override
	public void run() {
		while(true)
		System.out.println("동영상을 재생합니다.");

	}
}
