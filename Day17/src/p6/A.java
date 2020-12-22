package p6;

public class A {
	//클래스안에 넣을 수 있는 멤버
	int number;
	static int snumber;
	static final int MAX=100;
	int[] jumsu = new int[10];
	
	
	public A() {	
	}
	void method() {
//		bnumber=60;		(X)
//		System.out.println(SMAX);	(X)
//		sjumsu[0]=90;	(X)
		B b = new B();
		b.bMethod();
		b.bnumber=60;
		System.out.println(b.SMAX);
		b.sjumsu[0]=90;
		
	}
	static void smethod() {
	}
	
	class B{
		int bnumber;
//		static int sbnumber;	(X)
		static final int SMAX=100;
		int[] sjumsu = new int[10];
		public B() {}
		void bMethod() {	//밖 클래스의 모든 멤버들을 다 사용할 수 있다.
			number=50;
			snumber=50;
			System.out.println(MAX);
			jumsu[0]=10;
			method();
			smethod();
		}
//		static void sbMethod() {}	(X)
		class C{}
	}
}
