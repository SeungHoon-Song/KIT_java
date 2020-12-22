package p1;

public class StaticInstanceEx01 {

	public static void main(String[] args) {
		
		//인스턴스 변수 2개
		String nameMain;
		int ageMain;
		
		//Person 클래스의 클래스멤버(static)를 사용하기
		Person.tel="1234";
		Person.dept="컴퓨터공학";
		
		//Person 클래스의 인스턴스 멤버를 사용하기
		Person p = new Person();	//힙메모리에 올리기
		p.name = "홍길동";
		p.age = 20;
//		person.tel = "545"; 사용하지 못함
		
		//클래스 메소드를 사용하기
		Person.outputSt();
		
		//인스턴스 메소드
		p.output();
		
		
		

	}

}
