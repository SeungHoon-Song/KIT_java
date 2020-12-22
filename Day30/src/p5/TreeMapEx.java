package p5;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(80),"김자바");
		
//		NavigableMap<Integer, String> dm = scores.descendingMap();
		//TreeMap에 달아주고 출력하기만 하면 자동으로 중위오더로 검색해서 출력되므로 오름차순이된다.
		Set<Map.Entry<Integer,String>> ss = scores.entrySet();
		for(Map.Entry<Integer,String> dds:ss) {
			System.out.println(dds.getKey()+dds.getValue());
		}
		
		System.out.println("++++++++++++");
		//키값으로 내림차순 해준다. 메소드를 사용한다 descendingMap();
		NavigableMap<Integer, String> dm = scores.descendingMap();
		Set<Map.Entry<Integer,String>> ds = dm.entrySet();
		for(Map.Entry<Integer,String> dds:ds) {
			System.out.println(dds.getKey()+dds.getValue());
		}
		
		//dm변수를 통해서 오름차순으로 만들고 싶다.		내림차순 1번 -> 내림차순 1번
		NavigableMap<Integer, String> sm = dm.descendingMap();
		Set<Map.Entry<Integer, String>> sss = sm.entrySet();
		for(Map.Entry<Integer, String> dds : sss) {
			System.out.println(dds.getKey()+dds.getValue());
		}
		

//		Map.Entry<Integer, String> entry = null;
//		
//		entry = scores.firstEntry();
//		System.out.println("가장 낮은 점수 : "+entry);
//		
//		entry = scores.lastEntry();
//		System.out.println("가장 높은 점수 : "+entry);
//		
//		entry = scores.lowerEntry(new Integer(95));
//		System.out.println("95점 아래 점수 : "+entry);
//		
//		entry = scores.higherEntry(new Integer(95));
//		System.out.println("95점 위 점수 : "+entry);
		
	}

}
