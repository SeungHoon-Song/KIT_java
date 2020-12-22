package p4;

public class Order {
	int a=10;
	static int sa = 100;
	static {		//static 블록 여러개 둘수있고 처리순서는 먼저나온 것부터
		//a=a+1000;		인스턴스 변수는 사용 못함.	
		sa = sa+1000;
		System.out.println("클래스 블록3 "+sa);
	}
	public Order(){
		a=a+10; 
		sa = sa+10;
		System.out.println("기본생성자 "+a+" "+sa);
	}
	{
		a=a+100;
		sa = sa+100;
		System.out.println("인스턴스 블록1 "+a+" "+sa);
	}
	{
		a=a+100;
		sa = sa+100;
		System.out.println("인스턴스 블록2 "+a+" "+sa);
	}
	{
		a=a+100;
		sa = sa+100;
		System.out.println("인스턴스 블록3 "+a+" "+sa);
	}
	static {
		//a=a+1000;		인스턴스 변수는 사용 못함.
		sa = sa+1000;
		System.out.println("클래스 블록1 "+sa);
	}
	static {
		//a=a+1000;		인스턴스 변수는 사용 못함.
		sa = sa+1000;
		System.out.println("클래스 블록2 "+sa);
	}
	
}
