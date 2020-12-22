package p2;

import java.util.Map;
import java.util.Set;

import p1.AutoSaveThread;

public class ThreadInfoEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");	//스레드 그룹의 이름 만들기
		autoSaveThread.setDaemon(true);	//데몬스레드 만들기
		//스레드를 동작시키기 RUNNABLE 상태로 만들기
		autoSaveThread.start();
		Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();	//프로세스의 모든 스레드 상황구해주는 메소드
		Set<Thread> threads = map.keySet();	//map계열에서 key값들을 리턴해 주는 메소드

		for(Thread t: threads) {
			System.out.println("Name : "+t.getName()+(t.isDaemon()?"데몬":"주"));
			System.out.println("\t소속그룹 : "+t.getThreadGroup().getName());
		}
	}

}
