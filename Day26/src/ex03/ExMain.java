package ex03;

import java.util.*;

public class ExMain {

	public static void main(String[] args) {
		Video video = new Video();
		Music music = new Music();
		
		video.setPriority(10);
		music.setDaemon(true);
		
		ThreadGroup threadGroup = new ThreadGroup("Video");
		Thread m1 = new Thread(threadGroup, music);
		Thread m2 = new Thread(threadGroup, video);
		
		m1.start();
		m2.start();
		
		Map map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread:threads) {
			System.out.println(thread.getName()+(thread.isDaemon()?" 데몬":" 주"));
			System.out.println("소속 그룹 : "+thread.getThreadGroup().getName());
		}
		
		System.out.println("사용자 지정 스레드 그룹 이름 : "+(threadGroup.getName()));

		

	}

}

