package q4;

public class Cylinder {
	public Circle cc;
	public double height;
	
	public Cylinder(Circle cc, double height) {
		this.cc = cc;
		this.height = height;
	}

	public double getVolume() {
		return cc.getArea()*height;
	}

	public static void main(String[] args) {
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cd.getVolume());
	}

}
