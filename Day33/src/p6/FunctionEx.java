package p6;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionEx {

	private static List<Student> list = Arrays.asList(new Student("홍길동", 90.5, 96L), 
			new Student("신용권", 95.5, 93L));

	private static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}

	private static void printInt(ToDoubleFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsDouble(student) + " ");
		}
		System.out.println();
	}

	private static void printLong(ToLongFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsLong(student)+" ");
		}
	}
	private static void printBiFu(BiFunction<String, Integer, String> bf) {
		System.out.println(bf.apply("소나타", 300));
	}
	private static void printToDoubleBifu(ToDoubleBiFunction<Integer, Double> dbf) {
		System.out.println(dbf.applyAsDouble(10, 20.5));
	}
	
	public static void main(String[] args) {
		System.out.println("학생이름 : ");
		printString(t -> t.getName());
		
		System.out.println("영어 점수 : ");
		printInt(b->b.getEnglishScore());
		
		System.out.println("수학 점수 :");
		printLong(c -> c.getMathScore());
		
		printBiFu((t,v)->t+v+"만원");
		
		printToDoubleBifu((t,v)->t*v);
	}

}

class Student {
	private String name;
	private double englishScore;
	private long mathScore;

	public Student(String name, double englishScore, long mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public long getMathScore() {
		return mathScore;
	}

	public String getName() {
		return name;
	}

}