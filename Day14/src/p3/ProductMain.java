package p3;

public class ProductMain {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Iphone());
		b.buy(new Note());
		b.summary();

	}

}
