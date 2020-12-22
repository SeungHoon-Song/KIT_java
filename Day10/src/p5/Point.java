package p5;

public class Point {
	static int pointer=800;
	int instanceVar = 20;
	static {
		//this.pointer = 200;	this사용 못함
		System.out.println("네트워크셋팅");
		//instanceVar = 200;	사용 못함
	}
	{
		this.instanceVar = 100;
		System.out.println("포인트 초기화");
	}

	public Point() {
		this.instanceVar = 300;
		System.out.println("게임창 띄우기");
		pointer+=200;
		System.out.println("현재 포인터는"+pointer+"\n");
		
	}
	public static void stMethod() {
//		this.instanceVar;
//		this.pointer;		사용불가
	}
	
}
