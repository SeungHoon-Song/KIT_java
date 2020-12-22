package p3;

import java.util.*;

public class ArrayList2Ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("서울"));
		list.add("LA");
		list.add("인천");
		list.add("부산");
		list.add("서울");
		
		//서울의 인덱스 번호 출력
		int index = list.indexOf("서울");		//없으면 -1
		System.out.println(index);
		if(index==-1)
			System.out.println("없는 주소입니다.");
		else
			System.out.println(index+1+"번째 주소 입니다.");
		
		//서울의 라스트인덱스 번호 출력
		int index2 = list.lastIndexOf("서울");
		System.out.println(index2);
		if(index2==-1)
			System.out.println("없는 주소입니다.");
		else
			System.out.println(index2+1+"번째 주소 입니다.");
		
		//remove() 삭제하기
		String r = list.remove(1);
		System.out.println(r);
		System.out.println(list.get(2));
		
		boolean b = list.remove("부산");
		System.out.println(b);
		System.out.println(list.get(2));
		System.out.println("=========================");
		
		//전체 출력하기
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//전체 다 삭제하기
		list.removeAll(list);
		
		//전체 출력하기
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
