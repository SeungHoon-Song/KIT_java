package p1;

public class Person {
	private String courseName;
	//명시적 생성자를 작성하면 기본생성자는 컴파일러가 자동으로 만들어 주지 않는다.
	public Person(String courseName) {
		this.courseName = courseName;
	}
	public Person() {
		
	}
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return courseName;
	}
}
