package ex1;

public class AGrade extends WirelessClass{
	//시간당 단가
	int unitPrice = 82;	//시간당 단가
	int basePrice = 10000;
	String gradeCode="A";
	int discountRate = discountRateMethod(basePrice);	//할인요금
	String[] custName = new String[10];	//고객명
	int[] useTime = new int[10];	//사용시간
	int[] communicationFee = new int[10];	//이번달 통신요금
	
	static int cnt=0;
	@Override
	public void input(String cN, int uT) {
		custName[cnt] = cN;
		useTime[cnt] = uT;
		communicationFee[cnt]= communicationFeeMethod(unitPrice, useTime[cnt],basePrice, discountRate );		
		cnt++;
	}
	public void output() {
		for(int i=0;i<cnt;i++) {
			System.out.print(custName[i]+ "  ");
			System.out.print(gradeCode+" ");
			System.out.print( unitPrice+" ");
			System.out.print( basePrice+" ");
			System.out.print( useTime[i]+" ");
			System.out.print( discountRate+" ");
			System.out.print( communicationFee[i]);
			System.out.println();
		}
	}
}
