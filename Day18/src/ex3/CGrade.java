package ex3;

public class CGrade extends Wireless{
	String grade = "C";
	int hourper = 104;
	int basicFee = 15000;
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
