package q9;

public class Rectangle {
	double Length;
	double width;
	
	public Rectangle(double Length,double width) {
		this.Length=Length;
		this.width=width;
	}
	public double getArea() {
		return Length*width;
	}
	public double getCircumference() {
		return Length*2+width*2;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		System.out.println("면적: " + rc.getArea());
        System.out.println("둘레: " + rc.getCircumference());
	}
}
