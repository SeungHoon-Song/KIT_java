package q1;

public class Tank extends Unit{
	int x=150,y=150;
	public Tank() {
		
	}
	@Override
	void move() {
		x-=50;
		y+=50;
		System.out.println("탱크의 위치 : ("+x+","+y+")");
	}
	@Override
	void stop() {
		System.out.print("탱크의");
		super.stop();
	}
	void changeMode() {
		System.out.println("탱크 공격모드를 변환한다.");
	}
}
