package p6;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function; // int applyAsInt(T t,U u);
//		function = (a, b) -> a.compareToIgnoreCase(b);
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("CAB", "ab"));

		ToIntBiFunction<Integer, Integer> function1;
		function1 = Integer::compare;
		print(function1.applyAsInt(500, 200));
	}

	public static void print(int order) {
		if (order < 0) {
			System.out.println("사전순으로 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("동일한 문자열 입니다.");
		} else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
	}

}
