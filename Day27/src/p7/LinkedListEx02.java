package p7;

import java.util.*;

public class LinkedListEx02 {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();	//다형성
		list1.add("b");
		list1.add(0,"a");
		list1.add("c");
		list1.add("c");
		list1.add(null);
		
		//down casting해서 자손메소드 쓸 수 있도록 하기
		LinkedList<String> linkedList = (LinkedList<String>)list1;
		linkedList.addFirst("first");
		linkedList.addLast("last");
		linkedList.push("push");
		boolean offerB = linkedList.offer("offer");
		System.out.println(offerB+"~~~~~");
		String el = linkedList.element();
		System.out.println(el+"!!!!");
		el = linkedList.getLast();
		System.out.println(el+"###");
		el = linkedList.peek();
		System.out.println(el+"$$$");
		
		el = linkedList.poll();//추출하고 힙 메모리에서 삭제
		System.out.println(el+" poll한 자료");
		
		el = linkedList.poll();//추출하고 힙 메모리에서 삭제
		System.out.println(el+" poll한 자료");
		
		el = linkedList.pop();
		System.out.println(el+" pop한 자료");
		
		el = linkedList.remove();
		System.out.println(el+" remove한 자료");
		
		el = linkedList.remove(2);
		System.out.println(el+" remove한 자료");
		
		//전체 출력
		System.out.println("---- 전체 출력하는 자료 ----");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			
		}

	}

}
