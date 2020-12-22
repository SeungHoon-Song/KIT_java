package p2;

public class Box<T>{
	private T t;
	
	void set(T t) {
		this.t=t;
	}
	
	T get() {
		return t;
	}
}
