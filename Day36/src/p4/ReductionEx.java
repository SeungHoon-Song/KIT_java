package p4;

import java.util.Arrays;
import java.util.List;

import p1.Student;

public class ReductionEx {
	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동",92),
				new Student("신용권",95),
				new Student("김자바",88));
		
		int sum1 = studentList.stream().mapToInt(Student::getScore).sum();
		int sum2 = studentList.stream().map(Student::getScore)
				.reduce((a,b)->a+b)//BinaryOperator 추상메소드 R apply(T t, U u);
				.get();//get()메소드는 값이 있으면 값을 반환하고 그렇지 찮으면 NoSuchElementException을 throw하는 메소드
				
		int sum3 = studentList.stream().map(Student::getScore)
				.reduce(0, (a,b)->a+b);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}
}
