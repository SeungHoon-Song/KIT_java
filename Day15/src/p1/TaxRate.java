package p1;
//세금 계산 비즈니스로직 클래스
public class TaxRate {
	public void TaxRateMethod(Employee e) {
		if(e instanceof Manager) {
			//down casting
			Manager manager = (Manager) e;
			System.out.println("Manager세금 계산 "+manager.money*manager.taxRate);
		}else if(e instanceof Engineer) {
			Engineer engineer = (Engineer) e;
			System.out.println("Engineer세금 계산 "+engineer.money*engineer.taxRate);
		}else if(e instanceof Parttime) {
			Parttime parttime = (Parttime)e;
			System.out.println("Parttime세금 계산 "+parttime.money*parttime.taxRate);
		}else if(e instanceof Employee) {
		System.out.println("Employee세금 계산 "+e.money*e.taxRate);

	}
	}
}
