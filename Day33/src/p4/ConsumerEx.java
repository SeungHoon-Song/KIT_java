package p4;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");

		// void accepr(T t, U u); 람다식으로 accept메소드를 오버라이딩
		BiConsumer<Integer, Integer> biConsumer = (t, u) -> {
			System.out.println(t);
			System.out.println(u);
		};
		biConsumer.accept(10, 200);

		//void accept(double value);
		DoubleConsumer doubleConsumer = t -> {
			t=t+100; System.out.println(t);
		};
		doubleConsumer.accept(2.2);
		
		//void accpet(T t, int value);
		ObjIntConsumer<Car> objIntConsumer = (t, v) ->{
			System.out.println(t.getName());
			System.out.println(v);
		};
		Car car = new Car("소나타");
		objIntConsumer.accept(car, 100);
		
		//LongConsumer 작성
		//void accept(long value);
		LongConsumer longConsumer = t ->{
			System.out.println(t);
		};
		longConsumer.accept(1234567890);
	}

}
class Car{
	String name;
	public String getName() {
		return name;
	}
	public Car(String name) {
		this.name=name;
	}
}