package q1;

public class Marine extends Unit{
	int x=0,y=30;
	public Marine() {
		
	}
	@Override
	void move() {
		x+=10;
		y-=10;
		System.out.println("������ ��ġ : ("+x+","+y+")");

	}
	@Override
	void stop() {
		System.out.print("������ ");
		super.stop();
	}
	void stimPack() {
		System.out.println("���� �������� ����Ѵ�.");
	}
}
