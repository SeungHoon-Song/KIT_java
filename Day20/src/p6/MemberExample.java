package p6;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue","홍길동","12345",25,true);
		Member cloned=original.getMember();
		
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println("==================");
		
		cloned.id="red";
		cloned.password="7777";

		System.out.println("aa: "+cloned.id);
		System.out.println("aaaa: "+original.id);
		System.out.println(cloned.name);
		System.out.println("bb: "+cloned.password);
		System.out.println("bbbb: "+original.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);

	}

}
