package ex1;

public class WirelessClass implements WirelessInterface{
	@Override
	public int discountRateMethod(int basePrice) {
		return (int)(basePrice*0.1);
	}
	@Override
	public int communicationFeeMethod(int unitPrice, int useTime, int basePrice, int discountRate) {
		return (int)(unitPrice*useTime+basePrice-discountRate);
	}
	public void input(String cN, int uT) {
		
	}
	public void output() {
		
	}
}
