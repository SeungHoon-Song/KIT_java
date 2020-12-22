package p1;

public class OutterMain {

	public static void main(String[] args) {
		Outter outter = new Outter();//1단계
		outter.ia=30;
		outter.iaMethod();
		Outter.isa=100;
		Outter.isaMethod();
		
//		내부클래스의 멤버들은 외부클래스의 참조변수로 접근 못함
//		outter.iia=100;
//		outter.iiaMethod();
		
		//내부클래스를 객체화 해야한다. - 2단계
		Outter.Inner oi = outter.new Inner();
		
		oi.iia = 40;
		oi.iiaMethod();
		System.out.println(oi.iia);
		
		

	}

}
