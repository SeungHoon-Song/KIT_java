package p1;

import java.util.*;
import java.util.stream.IntStream;

public class SortEx {

	public static void main(String[] args) {
		//숫자일 경우
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4,1});
		intStream.distinct().sorted().forEach(a->System.out.print(a+" "));
		System.out.println();
		//객체일 경우
		List<Student> list = Arrays.asList(
				new Student("홍길동",10),
				new Student("정현희",30),
				new Student("박명자",25));
		list.stream().sorted().forEach(a->System.out.println(a.getName()+" "+a.getScore()));
		System.out.println();
		//내림차순 정렬하기
		list.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a.getName()+" "+a.getScore()));
	
	}

}