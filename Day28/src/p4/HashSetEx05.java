package p4;

import java.util.*;

//로또 번호 자동으로 나오게 하기
public class HashSetEx05 {

	public static void main(String[] args) {
		//HashSet 객체 생성
		Set<Integer> lotto = new LinkedHashSet<Integer>();
//		System.out.println(lotto.size());
		for(int i=0;lotto.size()<6;i++) {	//0<6 1<6 ... 5<6 6<6
			int lottoNum = (int)(Math.random()*45)+1;	//1~45
			System.out.println(lottoNum+"~~~");
			lotto.add(new Integer(lottoNum));
		}
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			int lo = it.next();
			System.out.print(lo+" ");
		}
//		Collections.sort(List<t> list);
		//set --> list 바꾸기
		List<Integer> list1 = new ArrayList<Integer>(lotto);
		List<Integer> list2 = new LinkedList<Integer>(lotto);
		
		System.out.println();
		System.out.println("정렬한 후");
		
		Collections.sort(list1);
		for(int lo1:list1) {
			System.out.print(lo1+" ");
		}
		
		System.out.println();
		System.out.println("----------------");
		
		Collections.sort(list2);
		for(int lo1:list2) {
			System.out.print(lo1 + " ");
		}
		
		//list --> set 바꾸기	1단계 메소드가 있는지 찾아보기 2단계 객체생성
		Set<Integer> set1 = new HashSet<Integer>(list1);
		Set<Integer> set2 = new LinkedHashSet<Integer>(list2);
		Set<Integer> set3 = new TreeSet<Integer>(list1);
		
		

	}

}
