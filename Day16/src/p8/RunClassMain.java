package p8;

public class RunClassMain {

	public static void main(String[] args) {
		//구현 클래스를 객체화 하세요.
		RunClassEx runClassEx = new RunClassEx();
		//inter01Method()호출하세요
		runClassEx.inter01Method();
		//inter0101Method()호출하세요
		runClassEx.inter0101Method();
		//inter0102Method()호출하세요
		runClassEx.inter0102Method();

		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter0102로 하세요
		Inter0102 inter0102 = new RunClassEx();

		//inter01Method()호출하세요
		inter0102.inter01Method();
		inter0102.inter0102Method();

		System.out.println("**********");
		Inter0101 ii = (Inter0101) inter0102;
		ii.inter0101Method();

		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter0102로 하세요
		Inter0101 inter0101 = new RunClassEx();
		inter0101.inter0101Method();
		inter0101.inter01Method();

		System.out.println("!!!!!!!!");
		Inter0102 inter01023 = (Inter0102) inter0101;
		inter01023.inter0102Method();

		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter01로 하세요
		Inter01 inter01 = new RunClassEx();
		inter01.inter01Method();

		Inter0101 inter01011=(Inter0101) inter01;//조부모의 참조변수로는 메소드 호출이 안되므로 형을 낮춤
		inter01011.inter0101Method();

		Inter0102 inter01022 = (Inter0102) inter01;
		inter01022.inter0102Method();


		}

		}

