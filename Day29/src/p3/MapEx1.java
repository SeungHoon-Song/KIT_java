package p3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		//HashMap객체 생성
		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<Integer,String> map2 = new HashMap<Integer,String>();
		Map<Integer,Double> map3 = new HashMap<Integer,Double>();

		//객체에 값을 넣기
		map.put("홍길동",new Integer(100));
		map.put("김길동",new Integer(80));
		map.put("박길동",new Integer(90));
		map.put("이길동",new Integer(90));
		map.put("최길동",new Integer(100));
		map.put("홍길동",new Integer(80));
		map.put("홍길동",new Integer(70));
		map.put("홍길동",new Integer(60));
		
		int size = map2.size();
		System.out.println("Map안에 있는 객체의 수 : "+size);
		
//		Set<Map.Entry<String, Integer>> enI = map.entrySet();
		Set<Map.Entry<String, Integer>> entryS = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it = entryS.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> n = it.next();
			String key = n.getKey();
			System.out.println(key+" "+map.get(key)+"!!!!!");
		}
		
		map2.put(new Integer(2020), "홍길동");
		map2.put(new Integer(2019), "김길동");
		map2.put(new Integer(2018), "박길동");
		
		map3.put(new Integer(2020), 89.5);
		map3.put(new Integer(2018), 99.5);
		
		//객체 출력하기 1개 get(), 모두 출력 - 모든 키를 반복적으로 넣어주기
		int score = map.get("홍길동");
		System.out.println(score);
		
		//모든 키의 값을 구하기
		System.out.println("<< 모든 키의 값 구하기 >>");
		Set<String> keys = map.keySet();	//모든 키
		
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();	//1개의 키
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("++++++++++++");
		//향상된 for
		System.out.println("<< 향상된 for문 전체 출력 >>");
		for(String key : keys) {
			System.out.println(key+" "+map.get(key));
		}
		System.out.println();
		
		String name= map2.get(2019);
		System.out.println(name);
		
		Double jumsu = map3.get(2020);
		System.out.println(jumsu);
		
		size = map2.size();
		System.out.println("Map안에 있는 객체의 수"+size);
		
		

	}

}
