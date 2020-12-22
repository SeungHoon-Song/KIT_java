package p1;

public class Person {
	//인스턴스 변수 2개 선언
		String name;
		int age;
		
		//클래스 변수 2개 선언 static
		static String tel;
		static String dept;
		
		//메소드
		//인스턴스 메소드
		//인스턴스 메소드안에 멤버들은 클래스멤버와 인스턴스 멤버를 다 넣을 수 있다.
		void output() {
			name = "최수진";
			age = 10;
			tel = "777";
			dept = "수학과";	
			System.out.println("인스턴스 메소드 부분입니다.");
			outputSt();
		}
		//클래스 메소드 static
		//클래스 메소드 안에 넣을 수 있는 것은 static으로 된 변수만 넣을 수 있다.		
		static void outputSt() {
			tel = "888";
			dept = "피아노";
//			name = "박경미";
//			age = 20;
			System.out.println("클래스 멤버의 메소드입니다.");
			//output();
			
			
		}
		
}
