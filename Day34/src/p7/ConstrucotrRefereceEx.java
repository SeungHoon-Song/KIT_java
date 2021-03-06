package p7;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstrucotrRefereceEx {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;
//		Function<String, Member> function1 = (t)->new Member(t);
		Member member1 = function1.apply("angel");
		System.out.println(member1.getName());
		
		BiFunction<String, String, Member> function2 = Member::new;
		//람다식으로 객체 생성하기
		BiFunction<String, String, Member> function3 = (t,u) -> new Member(t,u);
		Member member2 = function2.apply("신천사", "angel");
		System.out.println(member2.getName()+" "+member2.getId());
		
	}

}
class Member{
	private String name;
	private String id;
	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}
	public Member(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}