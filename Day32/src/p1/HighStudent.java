package p1;

public class HighStudent extends Student {
	private String courseName;

	public HighStudent(String courseName) {
		this.courseName = courseName;
	}

	public HighStudent() {
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
