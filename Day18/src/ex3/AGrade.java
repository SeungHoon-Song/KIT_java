package ex3;

public class AGrade extends Wireless{
	String grade = "A";
	int hourper = 86;
	int basicFee = 10000;
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
