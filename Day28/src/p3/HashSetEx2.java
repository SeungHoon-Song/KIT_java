package p3;

import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
			set.add(new Student("서울대",2018,10));
			set.add(new Student("서울대",2018,20));
			set.add(new Student("서울대",2018,15));
			set.add(new Student("서울대",2018,10));
			set.add(new Student("연세대",2020,30));
			set.add(new Student("연세대",2020,30));
			set.add(new Student("연세대",2020,30));
			set.add(new Student("고려대",2019,10));
			set.add(new Student("고려대",2019,10));
			
		//출력
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
	}

}
class Student{
	String school;
	int hakbun;
	int num;
	public Student() {

	}
	public Student(String school,int hakbun,int num) {
		this.school=school;
		this.hakbun=hakbun;
		this.num=num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학교: "+school+" 학번: "+hakbun+" 번호: "+num;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (school+hakbun+num).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return school.equals(s.school) && hakbun==s.hakbun && num==s.num;
		}
		return false;
	}
	
}
