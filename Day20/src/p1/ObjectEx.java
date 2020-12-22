package p1;


public class ObjectEx {
	public static void main(String[] args) {
		Value v1 = new Value("홍길동",30);
		Value v2 = new Value("홍길동",10);
		Value v3 = new Value("이순신",20);
		if(v1.equals(v2)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
		if(v1.equals(v3)) {
			System.out.println("같은 사람");
		}else {
			System.out.println("다른 사람");
		}
	}	
}

class Value{
	String name;
	int age;
	public Value(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value) {
			Value value = (Value)obj;
			if(name.equals(value.name) && age==value.age) {
				return true;
			}
		}
		return false;
	}
}
