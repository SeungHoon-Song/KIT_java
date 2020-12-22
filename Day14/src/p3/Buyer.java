package p3;
//비즈니스 로직 부분
public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i=0;
	
	//Product p = new TV();
	void buy(Product p) {	//물건을 샀을 경우 동작을 구현함
		
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;	//반환하지 않고 해당 메소드를 끝내기
		}
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;
		System.out.println(p.toString()+"를 구입 하셨습니다.");
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i].toString()+",";
			System.out.println(item[i]);
		}
		System.out.println("구입하신 물품의 총 금액은 "+sum+" 입니다.");
		System.out.println("현재 잔액은 "+money+"입니다.");
		System.out.println("구입하신 제품은 "+itemList+" 입니다.");
	}
}
