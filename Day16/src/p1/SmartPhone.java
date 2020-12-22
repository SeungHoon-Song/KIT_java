package p1;

public class SmartPhone extends Phone{
	//추상메소드를 반드시 오버라이딩해야지 에러가 안난다.
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void aa() {	//필수가 아닌 선택
		// TODO Auto-generated method stub
		super.aa();
	}
}
