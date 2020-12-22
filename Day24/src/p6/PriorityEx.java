package p6;

public class PriorityEx {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);	//다형성
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);	//1~9 우선순위를 1로 주기
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);	//10은 우선순위 10로 주기
			}
			thread.start(); //Runnable상태로 넣기 --> 스케쥴링(운영체제) --> Running
		}
	}
}
