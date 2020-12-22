package p2;

public class StaticInstanceEx02 {

	public static void main(String[] args) {
		
		Student.kor = 100;	//클래스명.변수 : static 변수
		Student.eng = 80;
		
		Student.total();	//클래스명.메소드명() : static 메소드
		
		Student s = new Student("이경희","음악과");
		System.out.println(s.name);	//참조변수명.변수명 : 인스턴스 변수
		System.out.println(s.dept);

	}

}
