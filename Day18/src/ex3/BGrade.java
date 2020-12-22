package ex3;

public class BGrade extends Wireless{
	String grade = "B";
	int hourper = 81;
	int basicFee = 12000;
	int saleFee;
	int totalFee;
	
	
	@Override
	public int discount() {
		saleFee=(basicFee/10);
		return saleFee;
	}
	@Override
	public int total(int time) {
		totalFee=(time*hourper)+basicFee-saleFee;
		return totalFee;
	}
}

