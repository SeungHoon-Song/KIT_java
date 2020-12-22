package p5;

public class VarOrder {
	
	int a;
	static int sa;
	{
		//a=100;//초기화블록
		sa=1000;
		System.out.println("a = "+a);
		System.out.println("sa = "+sa);
		System.out.println(4*InitEx01.EARTH_RADIUS*InitEx01.EARTH_RADIUS);
		//InitEx01.EARTH_RADIUS++;	//변경 에러
	}
	public VarOrder() {
		a=200;
		//sa=2000;
		System.out.println("a = "+a);
		System.out.println("sa = "+sa);
		System.out.println(4*InitEx01.EARTH_RADIUS*InitEx01.EARTH_RADIUS);

	}
	
}
