package p1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MapAndReduceEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), 
											new Student("신용권", 20), 
											new Student("유미선", 30));//1단계 컬렉션
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		
		//2단계 				컬렉션.오리지널 스트림.중간처리 스트림.최종처리 스트림
		OptionalDouble avg = list.stream().mapToInt(Student::getScore).average();
		System.out.println(avg);
		
		long count = list1.stream().count();
		System.out.println(count);
		System.out.println(list1);
		
		//OptionalDouble 클래스 자료를 일반형 double로 바꾸기
		double davg = avg.getAsDouble();
		System.out.println(davg);
		
		double avg1 = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균 점수: "+avg1);
	}

}

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
