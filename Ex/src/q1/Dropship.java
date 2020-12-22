package q1;

public class Dropship extends Unit{
	int x=1100,y=2500;
	public Dropship() {
	
	}
	@Override
	void move(int x,int y) {
		this.x-=100;
		this.y-=500;
		System.out.println("���ۼ��� ��ġ : ("+this.x+","+this.y+")");	
		}
	
	@Override
	void stop() {
		System.out.print("���ۼ��� ");
		super.stop();
	}
	
	void load(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("���ۼ� ������ġ("+x+","+y+")���� ������ �¿��.");
	}
	
	void unload(int x,int y) {
		System.out.println("���ۼ� ��ũ��ġ("+x+","+y+")���� ��ũ���� ������.");
	}
}
