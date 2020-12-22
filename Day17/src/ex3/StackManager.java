package ex3;

import java.util.Scanner;

public class StackManager {
	
	public static void main(String[] args) {
		StringStack s = new StringStack(10);
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		for(int i=0;i<5;i++) {
			String text = sc.next();
			s.push(text);
		}
		
		int count = s.length();
		for(int i=0;i<count;i++) {
			System.out.println(s.pop()+" ");
		}

	}

}
