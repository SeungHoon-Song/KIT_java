package p3;

import java.util.*;

public class ArrayListEx05 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(new Integer(10));
		list1.add(null);
		list1.add(new String("A"));
		list1.add(null);

		boolean ie = list1.isEmpty();
		System.out.println(ie);

		if (!list1.isEmpty()) {
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
		}

		list1.clear();
		if (!list1.isEmpty()) {	//빈ArrayList 이므로 반복하지 않았다.
			System.out.println("=========");
			for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
			}
		}
		ie = list1.isEmpty();
		System.out.println(ie);//true
		
		System.out.println("-----------------");
		List<Double> d1 = new ArrayList<Double>();
		d1.add(3.3);
		d1.add(4.4);
		d1.add(5.5);
		d1.add(6.6);
		d1.add(7.7);
		d1.add(8.8);
		
		List<Double> d2 = new ArrayList<Double>();
		d2.add(6.6);
		d2.add(7.7);
		d2.add(8.8);
		
//		d1.addAll(list1); //다른 타입 합치기는 오류는 나지 않지만 내용 붙이기X
//		d1.addAll(d2);
//		System.out.println(d1);
//		d1.add(9.9);
//		System.out.println(d1);
		
//		System.out.println(d1.containsAll(d2));
//		d1.retainAll(d2);	//d1에서 d2랑 겹치는 원소 남겨두고 나머지 삭제(3.3,4.4,5.5)
//		System.out.println(d1);
		
		d1.removeAll(d2);	//d1에서 d2랑 겹치는 원소 삭제
		System.out.println(d1);
		

	}

}
