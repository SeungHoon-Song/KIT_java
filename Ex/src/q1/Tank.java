package q1;

public class Tank extends Unit{
	int x=150,y=150;
	public Tank() {
		
	}
	@Override
	void move() {
		x-=50;
		y+=50;
		System.out.println("��ũ�� ��ġ : ("+x+","+y+")");
	}
	@Override
	void stop() {
		System.out.print("��ũ��");
		super.stop();
	}
	void changeMode() {
		System.out.println("��ũ ���ݸ�带 ��ȯ�Ѵ�.");
	}
}
