package p3;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		//사용자 만든 클래스의 멤버들을 Set넣기
		Set<String> set1 = new HashSet<String>();
		set1.add(new String("홍길동"));
		set1.add(new String("홍길동"));
		
		Set<Person> set = new HashSet<Person>();
		Person p1 = new Person("강수진",10);
		set.add(new Person("홍길동", 30));
		set.add(new Person("이순신", 20));
		set.add(new Person("정현희", 40));
		set.add(new Person("홍길동", 30));
		set.add(new Person("홍길동", 30));
		set.add(p1);
		//출력하기
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p);
		}
		System.out.println(set1);

	}

}
class Person{
	String name;
	int age;
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름은 : "+name+" 나이는 : "+age;
	}
	//요구사항에 따라서 같은 사람을 판단할 기준으로 hashCode() equals() 메소드로 구현해준다.
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age==p.age;
		}
		return false;
	}
}
