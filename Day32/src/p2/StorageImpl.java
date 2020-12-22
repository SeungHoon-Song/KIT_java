package p2;

public class StorageImpl<T> implements Storage<T>{
	private T[] array;
	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	public StorageImpl(int capacity) {
		this.array = (T[])(new Object[capacity]);	//타입피라미터로 배열을 생성하려면
		
	}

}
