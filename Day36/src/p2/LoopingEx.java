package p2;

import java.util.Arrays;
import java.util.stream.IntStream;

//peek(): 요소 전체를 반복하는 것 forEach()
public class LoopingEx {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		IntStream inS =Arrays.stream(intArr).filter(a->a%2==0).peek(n->System.out.println(n));//중간처리 스트림

//		int s = inS.sum();
//		System.out.println("총합: "+s);
		
		double avg = inS.average().getAsDouble();
		System.out.println("평균: "+avg);
		
		
	}

}
