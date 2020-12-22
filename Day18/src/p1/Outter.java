package p1;
//인스턴스 내부 클래스 예제
public class Outter {
	//인스턴스 멤버
	int ia = 10;
	void iaMethod() {//내부 클래스 멤버 사용하기 못함
//		iia=iia+50;
//		iiaMethod();
		System.out.println("이곳은 외부클래스의 메소드 부분입니다."+ia);
		
		
	}
	//정적 멤버
	static int isa = 20;
	static void isaMethod() {}
	class Inner{
		//자신의 멤버
		int iia = 30;
		void iiaMethod() {	//Outter 멤버들 모두 사용할 수 있음 ex) 외부 윈도우화면 내부 버튼 클래스
			ia = ia+30; isa = isa + 40; iaMethod(); Outter.isaMethod();
			System.out.println("이곳은 내부 클래스 부분입니다."+iia);
			}
//		static int iisa = 40;
//		static void iisaMethod() {}
		
	}
}
