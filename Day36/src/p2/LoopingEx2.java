package p2;

import java.util.Arrays;
import java.util.stream.IntStream;

//peek(): 요소 전체를 반복하는 것 forEach()
public class LoopingEx2 {

	public static void main(String[] args) {
		int[] intArr = {2,4,7};
		
		boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println(result);
		
		boolean result1 = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println(result1);
		
		boolean result2 = Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println(result2);
		
		
	}

}
