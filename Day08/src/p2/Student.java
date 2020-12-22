package p2;

public class Student {
	//필드선언
	int hakbun;
	String name;
	String dept;
	String tel;
	String teacherName;
	
	public Student(int hakbun,String name,String dept,String tel,String teacherName) {
		this.hakbun = hakbun;
		this.name = name;
		this.dept = dept;
		this.tel = tel;
		this.teacherName = teacherName;
	}
	
	//메소드 선언
	void inputMethod() {
		hakbun = 202010;
		name = "최진영";
		dept = "컴퓨터공학과";
		tel = "555";
		teacherName = "최미숙";
	}
	void searchMethod() {
		
	}
	void modifyMethod() {
		
	}
	void deleteMethod() {
		
	}
	void outputMethod() {
		System.out.println("학번: "+hakbun);
		System.out.println("이름: "+name);
		System.out.println("학과: "+dept);
		System.out.println("전화번호: "+tel);
		System.out.println("교사이름: "+teacherName);
	}
	
	//생성자
	/*접근제한자 클래스명() {
		
	}*/
	
	//매개 변수가 없는 모습의 생성자를 기본생성자
	public Student() {
		//힙메모리에 올라갈 때 자동으로 호출된다.
		//만약에 클래스에 만들어 놓지 않았다면 컴파일러가 자동으로 만들어 둔다. 내용은 없이
		//주로 하는 기능은 초기화
		hakbun = 202011;
		name = "korea";
	}
	
	//매개 변수가 있는 모습의 생성자 : 명시적 생성자
	//매개 변수의 구조가 같은건 사용X ex) (int a, int b)  (int c, int d)
	public Student(int hakbun,String name) {
		//a변수 2020 b변수 "홍길동"
		this.hakbun = hakbun;	//this는 멤버필드, 현재클래스 자기자신 멤버필드
		this.name = name;
	}
	public Student(String dept,String tel) {
		this.dept = dept;
		this.tel = tel;
	}
	public Student(int a,int b,int c) {
		
	}
	public Student(boolean a,String b) {
		
	}
	public Student(float a, long b) {
		
	}
	public Student(boolean a, String b, double c) {
		
	}
	public Student(Student a,boolean b,String c) {
		
	}

	//생성자를 여러개 둘 수 있다. 생성자 오버로딩(OverLoading)
	
}
