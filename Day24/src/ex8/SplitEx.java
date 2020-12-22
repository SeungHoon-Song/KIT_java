package ex8;

import java.util.StringTokenizer;

public class SplitEx {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		//방법1 splite()
		String[] str1 = str.split(",");
		for(String a:str1) {
			System.out.println(a);
		}
		
		System.out.println();
		//방법2 StringTokenizer
		StringTokenizer str2 = new StringTokenizer(str,",");
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		
	}

}
