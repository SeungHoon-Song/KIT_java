package main;

public class Student4{
	//접근제한자가 모두 prviate인 경우 같은 클래스안에서 생성자,필드,메소드는 자유롭게 쓸 수 있다.
	private int studentage = 20;
	private String studentName = "김명숙";
	
	public Student4(){
		studentage = studentage+10;
		studentName = "정현희";
		System.out.println("기본생성자");
	}
	private Student4(int studentage) {
		this.studentage = studentage;
	}
	private void student4Method() {
		studentage = studentage + 20;
		studentName = "이경미";
	}
	private void studentPrint() {
		System.out.println(studentage+" "+studentName);
	}
	
}

