package delivery_test;

public abstract class DeliveryClass{
	String[] local = new String[10];
	String[] name = new String[10];
	int[] time = new int[10];
	int[] amount = new int[10];
	int[] total = new int[10];
	
	public abstract int amountcost(int amount);
	public abstract int timecost(int time);
	public abstract int totalcost(int amount,int time);
}
