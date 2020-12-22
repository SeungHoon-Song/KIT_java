package ex2;

public class C extends Wireless{
	String grade = "C";
	int hour = 104;
	int basicFare = 15000;
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
