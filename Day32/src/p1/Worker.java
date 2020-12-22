package p1;

public class Worker extends Person{
	private String courseName;
	//자손클래스를 메모리에 올라갈 때 부모의 기본생성자를 가지고 올라간다.
	public Worker(String courseName) {
		this.courseName = courseName;
	}
	public Worker() {
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
