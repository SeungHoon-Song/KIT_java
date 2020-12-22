package p1;

public class ProductEx {

	public static void main(String[] args) {
		Product<Tv,String,Integer> productTv = new Product<Tv, String,Integer>();
		//스마트Tv, sm-1001, 2000000;
		//인터넷Tv, in-2001, 1000000;
		Tv tv1 = new Tv();
		productTv.setKind(tv1);
		
		
		
	}

}

class Product<T,M,I>{
	private T kind;
	private M mode;
	private I price;
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setMode(M mode) {
		this.mode = mode;
	}
	public void setPrice(I price) {
		this.price = price;
	}
	public T getKind() {
		return kind;
	}
	public M getMode() {
		return mode;
	}
	public I getPrice() {
		return price;
	}
}

class Tv{
	
}
class Car{
	
}