package p2;

public class UsingThis {
	public int Field = 10;
	
	class Inner{
		int Field = 20;
		
		void method() {
			MyFunctionInterface fi = () ->{
				System.out.println("outterField : "+Field);
				System.out.println("outterField : "+UsingThis.this.Field);
			
				System.out.println("innerField : "+Field);
				System.out.println("innerField : "+this.Field);
			};	//; 익명 객체
			fi.method1(); //메소드 호출
		}
	}
}
