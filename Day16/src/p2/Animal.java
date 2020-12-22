package p2;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();	//추상메소드로 처리
	// 실행 순서 : static { } --> main() --> { } --> 생성자
	public Animal() {
		//생성자
	}
	
	{
		//초기화블록
	}
	
	static {
		//정적 초기화 블록
	}
}
