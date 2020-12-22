package q1;

public class Student {
	String dept;
	int hakbun;
	
	public static void main(String[] args) {
		Student st = new Student();
		st.dept="컴퓨터공학";
		st.hakbun=20142911;
		System.out.println("학과:"+st.dept+" 학번:"+st.hakbun);
	}
	
}
