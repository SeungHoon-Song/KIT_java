package p5;

public class InitVar {
	int x;
	int y=x;
	boolean bx;
	boolean by=bx;
	String sx;
	String sy=sx;
	void printMethod() {
		System.out.println(x+" "+y);
		System.out.println(bx+" "+by);
		System.out.println(sx+" "+sy);
	}
	void localVarMethod() {
		int i=0;	//지역변수 초기값이 필요함
		int j=i;
		System.out.println(i+" "+j);
	}
	
}
