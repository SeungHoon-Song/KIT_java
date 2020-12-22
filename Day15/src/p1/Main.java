package p1;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Engineer engineer = new Engineer();
		Manager manager = new Manager();
		Parttime parttime = new Parttime();
		
		TaxRate taxrate = new TaxRate();
		
		taxrate.TaxRateMethod(employee);
		taxrate.TaxRateMethod(engineer);
		taxrate.TaxRateMethod(manager);
		taxrate.TaxRateMethod(parttime);

		

	}

}
