package p6;

import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("김철수");
		list.add("박영희");
		list.add("나영희");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("이름 내림 차순 정렬");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(new Integer(100));
		set.add(new Integer(78));
		set.add(new Integer(89));
		//전체 출력하기
		for(int sa:set) {
			System.out.print(sa+" ");
		}
		System.out.println();
		//set -> list바꾸기 1) 메소드확인 없다	2)생성자로 생성하기
		ArrayList<Integer> list2 = new ArrayList<Integer>(set);
		Collections.sort(list2);
		for(int s: list2) {
			System.out.print(s+" ");
		}
		
		//Map에 있는 것 sort하기
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a",new Integer(10));
		map.put("d",new Integer(20));
		map.put("b",new Integer(30));
		//Map -> List로 1) 메소드	2) 생성시킨다
		//entrySet() --> getkey() -->
//		Collection c = map.values();
//		List list3 = (List) c;
//		
//		Collections.sort(list3);
//		
		

	}

}
