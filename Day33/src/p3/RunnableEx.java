package p3;

public class RunnableEx {

	public static void main(String[] args) {
		/*Runnable runnable = () ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();*/
		//스레드 부분에서 run()의 오버라이딩을 람다식으로 표현함
		Thread thread = new Thread(() ->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}});
		thread.start();
	}

}
