package q1;

public class Main {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		marine.move();
		marine.move();
		marine.stop();
		marine.stimPack();
		System.out.println();
		
		tank.move();
		tank.move();
		tank.stop();
		tank.changeMode();
		System.out.println();
		
		dropship.move();
		dropship.move();
		dropship.stop();
		dropship.load(marine.x, marine.y);
		dropship.unload(dropship.x,dropship.y);
		
	}

}
