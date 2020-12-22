package p4;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorMinByMaxByEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;	// R apply(T t,U u); 추상메소드
		Fruit fruit;

		// minBy() 사용 int compare(T o1, T o2)
		binaryOperator = BinaryOperator.minBy((f1, f2)
						-> Integer.compare(f1.price, f2.price));
		
		fruit = binaryOperator.apply(new Fruit("딸기",6000),new Fruit("수박",10000));
		System.out.println(fruit.name);
		
		//maxBy()
		binaryOperator = BinaryOperator.maxBy((f1,f2)
						->Integer.compare(f1.price, f2.price));
		
		fruit = binaryOperator.apply(new Fruit("딸기",6000),new Fruit("수박",10000));
		System.out.println("비싼 과일은 "+fruit.name);
		
		//int applyAsInt(int left, int right);
//		IntBinaryOperator i = (t1,t2)->{return Math.max(t1,t2);}; 람다식 표현
		IntBinaryOperator i = Math::max;	//메소드 참조 - 매개값을 전달하는 역할만 하는 경우, 람다식을 더 간략화
		int m=i.applyAsInt(100, 200);
		System.out.println(m);
		
	}

}

class Fruit {
	public String name;
	public int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}