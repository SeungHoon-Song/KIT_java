package p4;

public class RemoteControlMain {

	public static void main(String[] args) {
//		RemoteControlRun rtr = new RemoteControlRun();
		RemoteControl rtr = new RemoteControl() {
			int a=10;
//			static int sa = 20;
			
			@Override
			public void turnOn() {
				System.out.println("익명객체 켜기");
			}
			
			@Override
			public void turnOff() {
				System.out.println("익명객체 끄기");
				ss();
			}
			void ss() {
				System.out.println("익명객체 자신의 메소드");
			}
		};
		
		rtr.turnOn();
//		rtr.ss();
		Searchable sa = new Searchable() {
			int sss=100;
			@Override
			public void s2() {
				cc();
				s1();
				sss= sss+10;
			}
			
			@Override
			public void s1() {
				cc();		
				sss= sss+10;
			}
			void cc() {
				s2();
				sss= sss+10;
			}
		};
		sa.s1();
		sa.s2();
		//sa.cc(); 이름이 없어서 다운캐스팅 못함
	}

}
