package p7;

import java.util.*;

//정렬하고자 하는 자료 비교하기
//나이 순서대로 TreeSet에 달아주기
public class TreeSetEx07 {

	public static void main(String[] args) {
		Set<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("홍길동",30));
		treeSet.add(new Person("홍길동",20));
		treeSet.add(new Person("이길동",10));
		treeSet.add(new Person("박길동",30));
		treeSet.add(new Person("박길동",30));
		System.out.println(treeSet);
	}

}
class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+" "+age;
	}
	@Override
	public int compareTo(Person o) {
		//1. 나이순서대로 정렬해서 TreeSet에 달아주기 - 오름차순
		/*if(age<o.age) return -1;	//age 트리에 달려 있는 나이 o.age트리에 새롭게 매달려야 하는 나이
		else if(age==o.age) return 0;
		else return 1;*/
		
		//2. 이름으로 순서대로 TreeSet에 매달아 주기 - 오름차순
		/*if(name.hashCode()<o.name.hashCode()) return -1;
		else if(name.hashCode()==o.name.hashCode()) return 0;
		else return 1;*/
		
		//3. 이름과 나이 순서대로 TreeSet에 매달아 주기 - 오름차순
		/*if((name.hashCode()+age)<(o.name.hashCode()+o.age)) return -1;
		else if((name.hashCode()+age)==(o.name.hashCode()+o.age)) return 0;
		else return 1;*/
		
		//4. 나이순서대로 정렬해서 TreeSet에 달아주기 - 내름차순
		/*if(age<o.age) return 1;	//age 트리에 달려 있는 나이 o.age트리에 새롭게 매달려야 하는 나이
		else if(age==o.age) return 0;
		else return -1;*/
		
		//5. 이름으로 순서대로 TreeSet에 매달아 주기 - 내름차순
		/*if(name.hashCode()<o.name.hashCode()) return 1;
		else if(name.hashCode()==o.name.hashCode()) return 0;
		else return -1;*/
		
		//6. 이름과 나이 순서대로 TreeSet에 매달아 주기 - 내름차순
		if((name.hashCode()+age)<(o.name.hashCode()+o.age)) return 1;
		else if((name.hashCode()+age)==(o.name.hashCode()+o.age)) return 0;
		else return -1;
		
		
	}
}