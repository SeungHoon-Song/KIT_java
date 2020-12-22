package hw;

import java.util.Comparator;
import java.util.Objects;

public class School {
	public static void main(String[] args) {
		Student s1=new Student(20142911,"홍길동","2학년",1);
		Student s2=new Student(20142912,"희동이","2학년",2);
		Student s3=new Student(20142913,"고길동","2학년",3);
		Student s4=new Student(20152912,"또치","1학년",3);
		Student s5=new Student(20152913,"도우너","1학년",4);
		Student s6=new Student(20152914,"둘리","1학년",5);
		
		int result=Objects.compare(s1,s2,new StudentComparator());
		if(result==0)System.out.println("s1과 s2가 같은번호");
		else if(result<0) System.out.println("s1과 s2의 앞번호");
		else System.out.println("s1과 s2의 뒷번호");
	}

static class Student{
	int hakbun;	//번호
	String name;
	String grade;
	int sclass;
	public Student(int hakbun,String name,String grade,int sclass){
	this.hakbun=hakbun;
	this.name=name;
	this.grade=grade;
	this.sclass=sclass;
	}
}
static class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
//		return Integer.compare(o1.hakbun, o2.hakbun); //정수형 자료 비교 - 오름차순
//		return Integer.compare(o2.hakbun, o1.hakbun); //정수형 자료 비교 - 내림차순
//		return o1.name.compareTo(o2.name);	//문자열 자료 비교 - 오름차순
//		return o2.name.compareTo(o1.name);	//문자열 자료 비교 - 내림차순
//		return o3.grade.compareTo(o4.grade);
//		return o4.grade.compareTo(o3.grade);
//		return Integer.compare(o1.sclass, o2.sclass);
		return Integer.compare(o2.sclass, o1.sclass);
		
	}
	}
}
