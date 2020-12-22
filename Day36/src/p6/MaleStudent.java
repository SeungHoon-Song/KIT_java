package p6;

import java.util.ArrayList;
import java.util.List;

import p5.Student;	//Sex, City

public class MaleStudent {
	private List<Student> list;	//요소를 저장할 컬렉션
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("["+Thread.currentThread().getName()+"] MaleStudent()");
	}
	//요소를 수집하는 메소드
	public void accumulate(Student student){
		list.add(student);
		System.out.println("["+Thread.currentThread().getName()+"] accumulate(Student student)");
	}
	
	//두 MaleStudent를 결합하는 메소드 (병렬처리시에만 호출됨)
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("["+Thread.currentThread().getName()+"] combine(MaleStudent other)");

	}
	public List<Student> getList(){
		return list;
	}
	
	
	
}
