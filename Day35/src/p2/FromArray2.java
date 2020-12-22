package p2;

import java.util.stream.IntStream;


	//숫자 범위로부터 스트림 얻기 1~100 300~1000

public class FromArray2 {

	static int sum = 0;
	public static void main(String[] args) {
		IntStream num = IntStream.range(1, 100);
		num.forEach(a->sum+=a);
		System.out.println(sum);

	}

}
