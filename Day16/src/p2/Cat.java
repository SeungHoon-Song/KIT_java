package p2;

public class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.print("야옹야옹!!");
	}
	
	public Cat() {
		super.kind="포유류";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "고양이";
	}
}
