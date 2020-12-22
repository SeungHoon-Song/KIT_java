package p8;

public class RunClassEx implements Inter0101,Inter0102{
	
	@Override
	public void inter01Method() {
		int r;
		r=X+Y;
		
		
	}

	@Override
	public void inter0102Method() {
		double r;
		r=X+Y+Z;
	}

	@Override
	public void inter0101Method() {
		//X=Y;	//X는 상수이기 때문에 변경 안됨
		double r;
		r=X+Z;
		System.out.println(r);
	}
	
}
