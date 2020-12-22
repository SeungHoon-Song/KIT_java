package p5;

public class ProcessEx {

	public static void main(String[] args) {
		Go go = new Go();
		Come come = new Come();
		Stop stop = new Stop();
		Pause pause = new Pause();
		Thread th1 = new Thread(go);	//우선순위 10
		Thread th2 = new Thread(come);	//5
		Thread th3 = new Thread(stop);	//우선순위 1
		Thread th4 = new Thread(pause);	//5
		th1.setPriority(Thread.MAX_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
	}

}
