package p1;

public class PhoneMain {

	public static void main(String[] args) {
		//SmartPhone 객체화
		SmartPhone smartphone = new SmartPhone();
		
		//SmartPhone 다형성
		Phone phone = new SmartPhone();
		
		//추상클래스는 Phone객체화 없다.
//		Phone phone2 = new Phone();

	}

}
