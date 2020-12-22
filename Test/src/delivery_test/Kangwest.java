package delivery_test;

public class Kangwest extends DeliveryClass{
	String local = "강서지역";
	String name = "박영수";
	int amount;
	int time;
	int total;
	
	@Override
	public int amountcost(int amount) {
		if(amount>=0&&amount<=100) {
			return 1000;
		}
		else if(amount>=101&&amount<200) {
			return 2000;
		}
		else if(amount>=201&&amount<300) {
			return 3000;
		}
		else 
			return 4000;
		}
	@Override
	public int timecost(int time) {
		if(time<1) {
			return 1000;
		}
		else if(time>=1&&time<2) {
			return 2000;
		}
		else if(time>=2&&time<3) {
			return 3000;
		}
		else
			return 4000;
	}
	@Override
	public int totalcost(int time, int amount) {
		total = timecost(time)+amountcost(amount);
		return total;
	}
}
