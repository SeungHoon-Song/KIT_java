package ex2;

public class B extends Wireless{
	String grade = "B";
	int hour = 81;
	int basicFare = 12000;
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
