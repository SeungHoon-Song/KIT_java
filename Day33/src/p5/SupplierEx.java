package p5;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.setPrice(30000000);
		//T get();
		Supplier<String> supplier = () -> {
			car.setName("소나타");
			return car.getName();
		};

		System.out.println(supplier.get());
	
	//BooleanSupplier - 소나타면 true , DoubleSupplier - 세금 가격30,000,000*2.25% , 
	//IntSupplier 가격30,000,000
	BooleanSupplier booleanSupplier = () ->{
		if(car.getName().equals("소나타"))
		return true;
		else return false;
	};
	System.out.println(booleanSupplier.getAsBoolean());

	
	DoubleSupplier doubleSupplier = () -> {
		return car.getPrice()*0.025;
	};
	System.out.println(doubleSupplier.getAsDouble());
	
	IntSupplier intSupplier= () ->{
		return car.getPrice();
	};
	System.out.println(intSupplier.getAsInt());
	}
}
class Car{
	String name;
	int price;
	double tax;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
}