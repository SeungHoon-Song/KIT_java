package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayEx01 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("강경오");
		list1.add("고희광");
		list1.add("김상윤");
		list1.add("김이준");
		list1.add("문우경");
		
//		잘못된 코드
//		String[] nameArray = (String[])list1.toArray();	//String[] = Object[]
//		System.out.println(nameArray[0]);
		
//		올바른 코드
		String[] nameArray = list1.toArray(new String[list1.size()]);	//new String[5]
		System.out.println(nameArray[0]);
		
//		T...a --> ArrayList 바꾸기
//		...의 의미 여러가지
		String[] arr1 = {"홍길동","정현희","이순신"};
		List converArr = new ArrayList(Arrays.asList(arr1)); 
		converArr.add("새로운 신입생");
		System.out.println(converArr.get(3));
		
		
		List<Integer> iAr = Arrays.asList(1,2,3);
		System.out.println(iAr.get(0));
		
		List<String> sAr = Arrays.asList("a","b","c");
		System.out.println(sAr.get(0));
		sAr.set(2,"d");
		//sAr.remove(2);	//고정된 List로 바뀌므로 크기 줄어들면 안됨
		for(String n: sAr) {
			System.out.print(n+" ");
		}
	}

}
