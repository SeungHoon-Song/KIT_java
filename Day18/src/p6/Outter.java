package p6;

public class Outter {
	int o1 =10;
	
	void o1Method() {
		
	}
	class Inner{
		int i1=20;
		int o1=30;
		
		void i1Method() {
			System.out.println(this.o1=o1+100);//생략하면 this
			System.out.println(Outter.this.o1 = Outter.this.o1+100);//바깥 클래스의 멤버를 가르킴
		}
	}

}
