package a.ab;

public class Person2 {
	protected int  age = 20;	//필드
	protected String name;
	protected Person2(String name) {	//생성자
		this.name=name;
	}
	protected void person1Method() {	//메소드
		System.out.println(name+" "+age);
	}

}
