package stockmanagement;

public class Electronics extends AbstractElectronics{
	String[] productName = new String[20];	//제품명
	String[] productNum = new String[20];	//품번
	int[] price = new int[20];			//가격
	int[] count = new int[20];			//수량
	
	static int cnt=0;
	@Override
	public void input(String ProductName, String ProductNum, int Price, int Count) {
		productName[cnt] = ProductName;
		productNum[cnt] = ProductNum;
		price[cnt] = Price;
		count[cnt] = Count;
		cnt++;	
	}
	public void output() {
		for(int i=0;i<cnt;i++) {
			if(productNum[i]!=null) {
			productNum[i].toUpperCase();
			System.out.println(productName[i]+"\t"+productNum[i]+"\t"+price[i]+"\t"+count[i]);
			}
			
		}
	}
}

