package p3;

public class DrivaerExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v1 = new Bus();
		Vehicle v2 = new Taxi();
		Vehicle v3 = new Vehicle() {
			
			@Override
			public void run() {
				//익명 객체
				System.out.println("달린다.");
			}
		};
		
		driver.driver(v1);
		driver.driver(v2);
		driver.driver(v3);
		
	}

}
