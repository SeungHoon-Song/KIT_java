package q1;

public class Q01 {

	public static void main(String[] args) {
//		String형의 학과와 정수형의 학번을 필드로 선언
//		Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
		
		Student st = new Student("컴공",20142911);
		System.out.println("학과: "+st.dept);
		System.out.println("학번: "+st.hakbun);
	}

}
