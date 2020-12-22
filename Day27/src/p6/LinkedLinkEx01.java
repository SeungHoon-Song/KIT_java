package p6;

import java.util.*;

public class LinkedLinkEx01 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<2000;i++) {
//			list1.add(0,String.valueOf(i));
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : "+(endTime-startTime));

		
		startTime = System.nanoTime();
		for(int i=0;i<2000;i++) {
//			list2.add(0,String.valueOf(i));
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간 : "+(endTime-startTime));
		
		list2.add("1111");
		System.out.println(list2.get(200));
		list2.set(0, "5000");
		
		//전체 출력 해 봄
		Iterator<String> it = list2.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
