package ex4;

public class Member {
	private String id;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		
		return id+" "+name;
	}
}