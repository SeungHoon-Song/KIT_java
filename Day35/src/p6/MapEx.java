package p6;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(a->System.out.print(a+" "));
		
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj->System.out.println(obj.intValue()));
		
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",10),
				new Student("홍길동",10),
				new Student("홍길동",10)
				);
		studentList.stream().mapToInt(Student::getScore).forEach(t->System.out.println(t));
		
		
		
	}

}
class Student{
	private String name;
	private int score;
	public Student(String name,int score) {
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