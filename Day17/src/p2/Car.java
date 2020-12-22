package p2;
//비즈니스 로직 부분의 클래스
public class Car {	
//		Tire frontLeftTire = new HankookTire();	//필드의 다형성
//		Tire frontRightTire = new HankookTire();
//		Tire backLeftTire = new KumhoTire();
//		Tire backRightTire = new KumhoTire();
		
		
	
		Tire[] tires = {new HankookTire(), new HankookTire(),new HankookTire(), new HankookTire()};
		void run() {
//			Tire[] tires = new Tire[4];
//			tires[0] = new HankookTire();
//			tires[1] = new HankookTire();
//			tires[2] = new HankookTire();
//			tires[3] = new HankookTire();
			for(int i=0;i<tires.length;i++) {
				tires[i].roll();
			}
			
//			for(Tire tire:tires) {
//				tire.roll();
//			}	//위 for문이랑 동일
			
//			frontLeftTire.roll();
//			frontRightTire.roll();
//			backLeftTire.roll();
//			backRightTire.roll();
		}
}
