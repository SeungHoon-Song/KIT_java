package ex3;

public class DGrade extends Wireless{
	String grade = "D";
	int hourper = 52;
	int basicFee = 20000;
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
