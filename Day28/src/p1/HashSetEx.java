package p1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		//넣기 add() - 중복해서 넣어 보기
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add(null);
		hashSet.add("c");
		hashSet.add("c");	//중복은 한번만
		
		//출력하기 방법1 - 향상된 for, 방법2 - iterator() 반복자	출력 순서는 보장되지 않는다.(예측할 수 없음)
		for(String h:hashSet) {
			System.out.println(h);
		}
		System.out.println("<< iterator 방식 >>");
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		//Set 안에 있는 객체 주소의 갯수 (크기)
		int size = hashSet.size();
		System.out.println(size);
		
		//삭제하기
		hashSet.remove("c");
		System.out.println("<< iterator 방식 >>");
		it = hashSet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}

}
