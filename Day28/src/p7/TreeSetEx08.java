package p7;

import java.util.*;

public class TreeSetEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> setTree = new TreeSet<Student>();
		setTree.add(new Student("서울대","홍길동","이길동",70));
		setTree.add(new Student("고려대","장길동","김길동",60));
		setTree.add(new Student("연세대","송길동","조길동",50));
		setTree.add(new Student("서울대","홍길동","박길동",40));
		setTree.add(new Student("고려대","장길동","최길동",30));
		setTree.add(new Student("연세대","송길동","조길동",100));
		System.out.println(setTree);
	}

}
class Student implements Comparable<Student>{
	String schoolName;
	String teacherName;
	String name;
	int score;

	public Student(String schoolName,String teacherName,String name,int score) {
		this.schoolName=schoolName;
		this.teacherName=teacherName;
		this.name=name;
		this.score=score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return schoolName+" "+teacherName+" "+name+" "+score;
	}
	@Override
	public int compareTo(Student s) {
		if(score<s.score) return 1;
		else if(score==s.score) return 0;
		else return -1;
	}
	
}
