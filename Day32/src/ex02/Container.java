package ex02;

public class Container<S, T> {
	private S name;
	private T t;
	public void set(S name, T t) {
		this.name = name;
		this.t = t;
	}
	public S getKey() {
		return name;
	}
	public T getValue() {
		return t;
	}
	
}
