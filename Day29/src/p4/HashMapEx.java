package p4;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		//객체 생성하기
		Map<Student, Integer> map =new HashMap<Student, Integer>();
		//Map에 넣기
		map.put(new Student(2020, "홍길동"),100);
		map.put(new Student(2019, "김길동"),80);
		map.put(new Student(2018, "홍길동"),90);
		map.put(new Student(2020, "홍길동"),100);
		
		//출력하기	2018 홍길동 key 넣어서 90점
		System.out.println(map.get(new Student(2018, "홍길동")));
		
		//전체를 출력하기 map.get(key) 반복해서 넣어 주기
		//방법1 key만 전부다 가지고 온다.
		Set<Student> keys = map.keySet();
		Iterator<Student> it = keys.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(map.get(s));
		}
		
		//방법2 Map에 있는 Map.Entry를 모두 가지고 온다. --> key만 가지고 온다 --> 반복해서 key를 넣어준다.
		//										--> value만 가지고 온다. 
		Set<Map.Entry<Student, Integer>> es = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> itt = es.iterator();
		while(itt.hasNext()) {
			Map.Entry<Student,Integer> k = itt.next();
			Student key = k.getKey();	//키만 가지고 온다.
			System.out.println("key ==> "+key);
			Integer value = k.getValue();	//값만 가지고 온다.
			System.out.println("value ==> "+value);
			System.out.println("key가 들어가서 값이 나오게 하는 메소드 이용 : "+map.get(key));
		}
		
	}

}
class Student{
	int sno;
	String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
		
	}
	//학번과 이름이 같으면 동등key입니다.
	@Override
	public int hashCode() {

		return (name+sno).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return sno==s.sno && name.equals(s.name);
		}
		return false;
	}
	
}