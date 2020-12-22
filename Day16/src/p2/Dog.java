package p2;

public class Dog extends Animal{
	@Override
	public void sound() {
		System.out.print("멍멍멍멍!!");
	}
	public Dog() {
		super.kind="강아지";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "강아지";
	}
}
