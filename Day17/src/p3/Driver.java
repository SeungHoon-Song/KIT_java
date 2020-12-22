package p3;

public class Driver {	//다형성 매개변수
	public void driver(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	//vehicle 팜조변수는 Bus 클래스를 인스턴스화한 값을 가르킬 수 있나?
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			bus.run();
		}else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
		}else if(vehicle instanceof Vehicle) {
			vehicle.run();
		}
	}
}
