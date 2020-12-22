package main;

import a.aa.Person1;
import a.ab.Person2;

public class PackageEx01 {

		public static void main(String[] args) {
			Person1 person1 = new Person1("홍길동");
			//접근해보기	public인 경우
			person1.age=30;
			new Person1("이순신");
			person1.person1Method();
			
			//접근해보기 protected인 경우 안된다.
//			Person2 person2 = new Person2("2번째사람");
//			person2.age = 30;
//			new Person2("생성자접근");
//			person2.person2Method();
			
			//접근해보기 default인 경우 다른 패키지에서 사용 못함
//			Student1 student1 = new Student1();	//생성 안됨
//			student1.studentage = 30;
//			student1.studentMethod();
//			new Student1();
			
			//접근해보기 default인 경우 같은 패키지에서는 사용
			Student3 student3 = new Student3();
			student3.studentage=30;
			student3.student3Method();
			
			//접근해보기 private인 경우 외부에서 아무도 접근 못함
			Student4 student4 = new Student4();
//			student4.studentage = 30;
//			student4.student4Method();
//			student4.studentPrint();
			
			
		}

}
