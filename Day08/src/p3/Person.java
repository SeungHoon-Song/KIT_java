package p3;

public class Person {
	//필드선언
	String name;
	int age;
	boolean gender;
	
	//생성자
	public Person(){
		this("고진경",20);
		this.name=null;
		age=0;	//this.age
		gender=false;
	}
	public Person(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		System.out.println();
	}
	public Person(String name,int age,boolean gender) {
		this();
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println();
		this.name = "이소영";
		this.age = 30;
		this.gender = false;
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
	}
	public Person(double number1, double number2) {
		System.out.println("이곳은 실수형");
		System.out.println(number1+number2);
	}
//	public Person(int number1, int number2) {
//		System.out.println("이곳은 정수형");
//		System.out.println(number1+number2);
//	}
}