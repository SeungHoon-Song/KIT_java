package p7;
//구현 클래스는 인터페이스를 다중 연결할 수 있다.
//추상클래스 1개만 단일 상속  받고 2개의 인터페이스를 다중 연결
public class Fighter extends AbstractEx implements Unit,Fightable{
	//모든 추상메소드를 다 오버라이딩해야 한다.
	@Override
	public void moveAb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atMeth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void number() {
		// TODO Auto-generated method stub
		Unit.super.number();
	}

	@Override
	public void fiMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unitMax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void interMethod() {
		// TODO Auto-generated method stub
		super.interMethod();
	}

	@Override
	void abMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}
