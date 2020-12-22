package p5;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;	//추상메소드 int applyAsInt(int left,int right);
		//정적 메소드 참조
		operator = (x,y) -> Calculator.staticMethod(x, y);	//람다식 표현 메소드 재정의
		System.out.println(operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;	//정적 메소드 참조
		System.out.println(operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator cal = new Calculator();
		operator = (x,y) -> cal.instanceMethod(x, y);	//람다식으로 인스턴스 메소드 호출
		System.out.println(operator.applyAsInt(100, 200));
		
		operator = 	cal::instanceMethod;	//인스턴스 메소드 참조
		System.out.println(operator.applyAsInt(100, 200));

	}

}
class Calculator{
	public static int staticMethod(int x, int y) {	//정적 메소드 선언
		return x+y;
	}
	public int instanceMethod(int x,int y) {	//인스턴스 메소드 선언
		return x+y;
	}
}