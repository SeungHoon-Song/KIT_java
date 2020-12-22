package p1;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name=name;
		this.score=score;
	}
	
	@Override
	public int compareTo(Student o) {
		
		//return name.compareTo(o.name);	//문자열 이름 순서대로 정렬
		return Integer.compare(score,o.score);	//점수순으로 정렬
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}