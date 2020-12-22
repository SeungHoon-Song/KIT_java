package ex2;

public class A extends Wireless{
	String grade = "A";
	int hour = 86;
	int basicFare = 10000;
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
