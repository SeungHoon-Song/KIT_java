package q1;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// 문자를 15자로 입력하세요==> javajspspringaa
		//		출력화면
		//		a의 갯수 ==> 4개
		//		j의 갯수==> 2개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 15자로 입력하세요==>");
		String sourceArray = sc.next();
		sourceArray.charAt(0);
		int[] alpha = new int[26];
		for(int i=0;i<sourceArray.length();i++) {
			char ch = sourceArray.charAt(i);
			alpha[ch-'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(alpha[i]!=0) {
            System.out.println((char)(97+i) + "의 갯수 ==> " + alpha[i]);
			}
        }
	}

}
