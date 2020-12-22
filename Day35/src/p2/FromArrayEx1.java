package p2;

import java.util.Arrays;
import java.util.stream.Stream;

//배열로 오리지널 스트림 얻기
public class FromArrayEx1 {

	public static void main(String[] args) {
		//1단계 배열 만들기
		String[] strArray = {"홍길동","신용권","김미나"};
		//2단계 오리지널 스트림 얻기
		Stream<String> strStream =  Arrays.stream(strArray);
		//3단계 최종 스트림 출렵합니다. 스트림안에 자료 모두 소진됨
		strStream.forEach(a->System.out.println(a+" "));
		System.out.println("-----------");
		//최종 스트림 출력합니다.	2번 최종 스트림을 했으므로 에러남
//		strStream.forEach(a->System.out.println(a+" "));
		
		Double[] doubleArray = {1.1,2.2,3.3};
		Stream<Double> douStream = Arrays.stream(doubleArray);
		douStream.forEach(a->System.out.println(a+" "));
		
		
		Integer[] intArray = {1,4,2,2};
//		Stream<Integer> intStream = Arrays.stream(intStream);
//		intStream.forEach(a->System.out.println(a+" "));
		

	}

}
