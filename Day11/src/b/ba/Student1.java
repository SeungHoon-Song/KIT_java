package b.ba;

class Student1 {
	//접근제한자가 모두 default인 경우
	int studentage = 20;
	String studentName = "김명숙";
	
	Student1(){
		System.out.println("기본생성자");
	}
	void student1Method() {
		System.out.println("메소드부분");
	}
	
}
