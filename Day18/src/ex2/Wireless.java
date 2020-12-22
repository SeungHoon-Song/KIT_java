package ex2;

public abstract class Wireless {
	String[] name = new String[10];
	String[] grade = new String[10];
	int[] time = new int[10];
	int[] hour = new int[10];
	int[] basicFare = new int[10];
	int[] saleMoney = new int[10];
	int[] totalMoney = new int[10];
	
	public abstract int discount();
	public abstract int total(int time);
}
