package p2;

import java.util.*;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever"); 
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("f");
		
		
		System.out.println("c~f사이 단어 검색 : ");
		//NavigableSet<String> rangeSet = treeSet.subSet("c",true,"f",true);//딱 f까지만 포함
		NavigableSet<String> rangeSet = treeSet.headSet("c",true);	//"c"문자열보다 아래의 문자열
		for(String word:rangeSet) {
			System.out.println(word);
		}
	}

}
