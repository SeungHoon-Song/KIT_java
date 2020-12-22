package ex3;

public abstract class Wireless {
	String[] name = new String[10];
	String[] grade = new String[10];
	int[] hourper = new int[10];
	int[] basicFee = new int[10];
	int[] time = new int[10];
	int[] saleFee = new int[10];
	int[] totalFee = new int[10];
	
	public abstract int discount();
	public abstract int total(int time);
}
