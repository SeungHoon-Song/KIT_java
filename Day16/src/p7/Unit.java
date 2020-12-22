package p7;
//인터페이스끼리는 상속을 할 수 있다.
//부모 인터페이스 2개를 상속을 받고 싶다.
//자바에서의 인터페이스에서는 상속(extends)는 다중상속 됩니다.
public interface Unit extends ObjectInter, Moveable{
	//상수 UnitMAX= 100
	static final int UNITMAX = 100;
	
	//추상메소드 unitMax()
	public abstract void unitMax();
	
	
	

}
