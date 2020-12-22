package q3;

public class Cylinder {
	public Circle cc;
	public double height;
	
	public double getVolume() {
		return cc.getArea()*height;
	}

	public static void main(String[] args) {
		Cylinder cd = new Cylinder();
		cd.cc = new Circle(2.8);
		cd.height=5.6;
		System.out.println(cd.getVolume());

	}

}
