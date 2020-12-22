package p2;

public class ClassEx02 {

	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st.hakbun);
		System.out.println(st.name);
		System.out.println(st.dept);
		System.out.println(st.teacherName);
	
		System.out.println("<< st1참조변수가 가르키는 필드출력>>");
		Student st1 = new Student(2020,"홍길동");
		System.out.println(st1.hakbun);
		System.out.println(st1.name);
		
		System.out.println();
		System.out.println("<< st2참조변수가 가르키는 필드출력>>");
		Student st2 = new Student("컴퓨터공학과","tel:12345");
		System.out.println(st2.dept);
		System.out.println(st2.tel);
		System.out.println(st1.hakbun);
		System.out.println(st1.name);
		
		System.out.println();
		Student st3 = new Student(2040,"김수연","수학과","777","박명자");
		System.out.println(st3.hakbun);
		System.out.println(st3.name);
		System.out.println(st3.dept);
		System.out.println(st3.tel);
		System.out.println(st3.teacherName);
		
		Student st4 = new Student(3.4f, 100L);
		Student st5 = new Student(false, "50");
		Student st6 = new Student(new Student(), true,"aa");
		Student st7 = new Student(90,80,10);
		Student st8 = new Student(90,80);
	}

}

////Student 클래스의 멤버 변수를 사용하고 싶다.
//		//힙 메모리에 올린다.
//		Student st = new Student();
//		//필드에 값을 넣는다.
//		st.hakbun = 202001;
//		st.name = "홍길동";
//		st.tel = "12345";
//		st.teacherName = "정현희";
//		//필드에 값을 변경한다.
//		st.name = "이순신";
//		st.hakbun = st.hakbun+10;
//		
//		//필드에 값을 지운다.
//		st.name = null;
//		//다른 클래스에 있는 필드를 출력
//		System.out.println(st.hakbun);
//		System.out.println(st.name);
//		System.out.println(st.dept);
//		System.out.println(st.tel);
//		System.out.println(st.teacherName);
//		
//		//메소드에 호출하기
//		//입력 메소드를 호출하여서 값을 넣어보기
//		st.inputMethod();	//"최미숙"
//		st.outputMethod();