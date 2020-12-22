package p6;

import java.util.*;

public class TreeSetEx01 {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>();
		//{10,0,8,9,12,8,-10,5,0}
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(8);
		treeSet.add(7);
		treeSet.add(9);
		treeSet.add(12);
		treeSet.add(8);
		treeSet.add(-10);
		treeSet.add(5);
		treeSet.add(0);
		
		System.out.println(treeSet);	//중위오더 순서대로 읽어서 출력
		
		
		//여러가지 자료형 Set안에 넣기 오류 : 정렬할 형이 일정하지 않아서
//		Object[] objArr = {1, 1.1, true, "A", "a", "B", "한글", "!!",1.1};
//		Set treeSet1 = new TreeSet();
//		for(int i=0;i<objArr.length;i++) {
//			treeSet1.add(objArr[i]);
//		}
//		for(Object o : treeSet1) {
//			System.out.print(o+" ");
//		}
		
		//문자형만 대문자 소문자
		TreeSet<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("ab");
		treeSet2.add("AB");
		treeSet2.add("한글");
		treeSet2.add("cd");
		treeSet2.add("!!");
		treeSet2.add("ab");
		treeSet2.add("ef");
		treeSet2.add("ccc");
		treeSet2.add("d");
		
		System.out.println(treeSet2);	//유니코드 순서대로 정렬되어서 출력된다.
		System.out.println(treeSet2.subSet("a",true,"d",false));	//"a"포함하고 "d"는 포함하지 않고
		System.out.println(treeSet2.subSet("a", true, "d", true));	//"a"포함하고 "d"는 포함하기
		
		

	}

}
