package ex04;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		//int getAsInt();
		IntSupplier supplier = () -> {
			int result = x * 10 + y;
			return result;
		};

		int result = supplier.getAsInt();
		return result;
	}

	
	public static void main(String[] args) {
		System.out.println(method(3, 5));

	}

}