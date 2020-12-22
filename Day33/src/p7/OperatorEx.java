package p7;

import java.util.function.IntBinaryOperator;

public class OperatorEx {

	private static int[] scores = { 92, 95, 87 };

	private static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // 1. 92,92 2. 92,95 3. 95,87
		}
		return result;

	}

	// 87이 출력되게 코드 작성
	private static int minOrMax(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // 1. 92,92 2. 92,95 3. 95,87
		}
		return result;
	}

	// 최대값도 아니고 최소값도 아니게 코드를 작성해 보세요.
	private static int notMinandMax(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // 1. 92,92 2. 92,95 3. 95,87
		}
		return result;
	}

	public static void main(String[] args) {
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});

		int min = minOrMax((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});

		int center = notMinandMax((a, b) -> {
			if(a<max && a>min)
				return a;
			else
				return b;
		});
		System.out.println(max);
		System.out.println(min);
		System.out.println(center);

	}

}
