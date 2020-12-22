package q1;

public class Marine extends Unit{
	int x=0,y=30;
	public Marine() {
		
	}
	@Override
	void move() {
		x+=10;
		y-=10;
		System.out.println("보병의 위치 : ("+x+","+y+")");

	}
	@Override
	void stop() {
		System.out.print("보병의 ");
		super.stop();
	}
	void stimPack() {
		System.out.println("보병 스팀팩을 사용한다.");
	}
}
