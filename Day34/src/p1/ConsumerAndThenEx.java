package p1;

import java.util.function.Consumer;

public class ConsumerAndThenEx {

	public static void main(String[] args) {
		// void accept(T t);
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA " + m.getName());
		};
		Consumer<Member> consumerB = (m) -> System.out.println("consumerB " + m.getId());

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);

		//consumerA.accept(new Member("홍길동", "123", new Address("대한민국", "서울")));
		//consumerB.accept(new Member("홍길동", "123", new Address("대한민국", "서울")));
		consumerAB.accept(new Member("홍길동", "123", new Address("대한민국", "서울")));
	
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
