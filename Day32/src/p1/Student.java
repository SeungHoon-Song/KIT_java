package p1;

public class Student extends Person{
	private String courseName;

	public Student(String courseName) {
		this.courseName = courseName;
	}
	public Student() {
		
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
