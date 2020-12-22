package p3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List al = new ArrayList();	//객체생성 다형성
		//값 넣기 	- 정수 10,20,30 실수 1.1, 3.3 논리형 true, false Car클래스, Student클래스
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(10));//중복 허용
		al.add(new Double(1.1));
		al.add(new Double(3.3));
		al.add(new Boolean(true));
		al.add(new Boolean(false));
		al.add(new Car());
		al.add(new Student());
		al.add(new Car());//중복 허용
		al.add(new Car());
		al.add(3, new Integer(10));	//삽입하기
		al.add(5, new Student());
		
		//인덱스 내용 바꾸기(수정하기)
		al.set(3, new Double(10.10));
		al.set(5, new Car());
		
		//ArrayList안에 들어 있는 내용을 출력하기
		System.out.println("index 3=> "+al.get(3));
		System.out.println("index 4=> "+al.get(4));
		System.out.println("index 5=> "+al.get(5));
		System.out.println("index 6=> "+al.get(6));
		
		//전체 출력하기 get(0) ~ get(10) 반복하면 된다.
		//ArrayList의 전체 크기를 알고 싶다? API 확인
		System.out.println(al.size());
		System.out.println("----전체내용----");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
	}

}
class Car{
	
}
class Student{

}