package p2;

import java.util.function.Function;

public class FunctionAndthenComposeEx {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		//R apply(T t);
		functionA = m -> m.getAddress();	//apply() 추상메소드 오버라이딩
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "123", new Address("대한민국", "서울")));//메소드 호출
		System.out.println("거주 도시 : "+city);
		
		Address a = functionA.apply(new Member("홍길동", "123", new Address("대한민국", "서울")));
		System.out.println(a);
		city = functionB.apply(a);
		System.out.println(city);
		
		System.out.println("------compose() 사용하기");
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "123", new Address("대한민국", "서울")));
		System.out.println("거주 도시 : city");

	}

}
class Member {
	private String name;
	private String id;
	private Address address;

	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;

	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
}