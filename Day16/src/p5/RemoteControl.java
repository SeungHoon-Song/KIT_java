package p5;
//인터페이스
public interface RemoteControl {
		//상수 
		static final double PI = 3.14;
		double EARTHAREA = 5478.651;	//생략해도 자동으로 static final
		final double EARTHHEIGHT = 500;
		static double MAX=99999;
		
		//추상메소드 public abstract가 생략될 수 있습니다.
		public abstract void trunOn();
		void turnOff();		//public abstract가 생략
		public void soundOn();//abstract가 생략
		abstract void soundOff();//public 생략

		//default메소드를 1.8버젼에서 허용함
		default void setMute() {	//동작코드 달성
			}	//인스턴스 메소드
		default void setMM() {}
		
		//정적메소드 허용 1.8버젼에서 허용함
		static void aa() {}	//클래스 메소드
		
		//생성자 만들기 - 안됨
//		public RemoteControl() {}
		
		//초기화 블록 - 안됨
//		{ }
		
		//정적 초기화 블록 - 안됨
//		static { }
}
