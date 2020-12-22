package p1;
//제네릭인 경우 코드
public class Box<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}

}
