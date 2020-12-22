package p2;

public class Car {
	//필드
	Tire frontLeftTire = new Tire("앞 왼쪽",6);
	Tire frontRightTire = new Tire("앞 오른쪽",2);
	Tire backLeftTire = new Tire("뒤 왼쪽",3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
	//달린다
	int run() {
		boolean flt = frontLeftTire.roll();
		boolean frt = frontRightTire.roll();
		boolean blt = backLeftTire.roll();
		boolean brt = backRightTire.roll();
		
		
		System.out.println("자동차가 달립니다.");
		if(flt==false) {
			stop();
			return 1;
		}
		if(frt==false) {
			stop();
			return 2;
		}
		if(blt==false) {
			stop();
			return 3;
		}
		if(brt==false) {
			stop();
			return 4;
		}
		return 0;		
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
