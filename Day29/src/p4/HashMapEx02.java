package p4;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		Map<Person,Integer> map = new HashMap<Person, Integer>();
		map.put(new Person("123","서울","홍길동"), 100);
		map.put(new Person("234","인천","김길동"), 90);
		map.put(new Person("345","서울","박길동"), 200);
		map.put(new Person("123","서울","홍길동"), 300);
		
		//1개 검색하기
		System.out.println(map.get(new Person("123","서울","홍길동")));
		int point = map.get(new Person("123","서울","홍길동"));
		System.out.println(point);
		
		//모두 출력하기
		//방법 1 keySet()이용 - 키값들을 구함
		System.out.println("+++++++++++++++");
		Set<Person> keySet2 = map.keySet();
		for(Person key: keySet2) {
			System.out.println(map.get(key));
		}
		
		//방법2로 작성하기 entrySet() 이용하기
		Set<Map.Entry<Person, Integer>> entrySet3 = map.entrySet();
		for(Map.Entry<Person, Integer> entrySet: entrySet3) {
			//getKey()
			System.out.println(entrySet.getKey());
			//getValue()
			System.out.println(entrySet.getValue());
		}
		
		
	}

}
class Person{
	String tel;
	String city;
	String name;
	public Person(String tel, String city, String name) {
		this.tel=tel;
		this.city=city;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return (tel+city+name).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return tel.equals(p.tel) && city.equals(p.city) && name.equals(p.name);
		}
		return false;
	}
}
