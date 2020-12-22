package p2;

import p3.Person;

public class ClassEx05 {

	public static void main(String[] args) {
		input(10);
		input("홍길동");
		input(5.5);
		input(50,100);
		input(new Person());
		input(true,300L);
	}
	//메소드 오버로딩
	static void input(int a) {
		System.out.println("1번"+a);
	}
	static void input(int a,int b) {
		System.out.println("4번"+a+b);
	}
	static int input(double a) {
		System.out.println("3번"+a);
		return 0;
	}
	static String input(String a) {
		System.out.println("2번"+a);
		return null;
	}
	static void input(Person p) {
		System.out.println("5번");
	}
	static void input(boolean a,long b) {
		System.out.println("6번"+a+b);
	}
	

}
