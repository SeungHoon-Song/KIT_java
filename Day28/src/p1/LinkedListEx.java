package p1;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add(2,"a");
//		list.removeFirstOccurrence("a");
		list.removeLastOccurrence("a");
		System.out.println(list);

	}

}
