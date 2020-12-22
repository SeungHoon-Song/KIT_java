package p6;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name);	//부모인 Thread의 메소드
		
	}
	@Override
	public void run() {
		for(int i=0;i<2000;i++) {
			System.out.println(getName());
		}
	}
	

}
