package ex2;

public class D extends Wireless{
	String grade = "D";
	int hour = 52;
	int basicFare = 20000;
	int saleMoney;
	int totalMoney;
	@Override
	public int discount() {
		saleMoney=basicFare/10;
		return saleMoney;
	}
	@Override
	public int total(int time) {
		totalMoney=(hour*time)+basicFare-saleMoney;
		return totalMoney;
	}
}
