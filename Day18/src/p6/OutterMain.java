package p6;


public class OutterMain {

	public static void main(String[] args) {
		//인스턴스 내부클래스의 메소드호출
		//1단계 외부 객체화 -> 2단게 내부 객체화
		Outter ot = new Outter();
		Outter.Inner in = ot.new Inner();
		in.i1Method();
	}

}
