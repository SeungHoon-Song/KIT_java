package p4;

import java.util.*;

public class ArrayEx4 {

	public static void main(String[] args) {
		final int LIMIT = 15;
		String source = "0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()ZZZ";
		int length = source.length();
//		System.out.println(length);
		List list = new ArrayList(length/LIMIT+10);	//13
		for(int i=0;i<length;i+=LIMIT) {	//i=0, 15, 30, 45 4번 반복
			if(i+LIMIT<length) {	//10<49 true
				list.add(source.substring(i,i+LIMIT));	//0~15, 16~30, 31~45
			}else {	//40~나머지 인덱스49
				list.add(source.substring(i));
			}
		}
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
