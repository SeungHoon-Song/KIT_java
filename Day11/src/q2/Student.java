package q2;

public class Student {
	private String dept;
	private int hakbun;
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.setDept("컴퓨터공학");
		st.setHakbun(20142911);
		System.out.println("학과:"+st.getDept()+" 학번:"+st.getHakbun());
	}
	
}
