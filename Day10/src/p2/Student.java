package p2;

public class Student {
	static int kor;
	static int eng;
	static int hap;
	String name;
	String dept;
	
	public Student(String name, String dept) {
		this.name=name;
		this.dept=dept;
	}

	static void total() {
		hap=kor+eng;
	}
	
}
