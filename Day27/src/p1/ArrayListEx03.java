package p1;

import java.util.*;

public class ArrayListEx03 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("서울");
		list1.add("LA");
		list1.add("서을");
		list1.add("LA");
		list1.add("인천");
		Scanner sc = new Scanner(System.in);
		System.out.print("비행기편 알아보기 가는 도시명을 입력하세요 : ");
		String cityName = sc.next();
		
		if(list1.contains(cityName)) {
			System.out.println("해당하는 도시에 비행기가 있습니다.");
		}else {
			System.out.println("비행하지 않습니다.");
		}
		

	}

}
