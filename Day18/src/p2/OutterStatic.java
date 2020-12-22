package p2;

public class OutterStatic {
	int ia = 10;
	void iaMethod() {//내부 클래스 멤버 사용하기 못함
//		iia=iia+50;
//		iiaMethod();
		InnerStatic.iisa = 100;
		InnerStatic.iisaMethod();
		System.out.println("이곳은 외부클래스의 메소드 부분입니다."+ia);
		}
		//정적 멤버
		static int isa = 20;
		static void isaMethod() {}
		
		static class InnerStatic{
			//인스턴스 자신의 멤버
			int iia = 30;
			void iiaMethod() {
				iia = iia-10;
//				ia = ia+30;
				isa = isa +40;
//				iaMethod();
				isaMethod();
			}
			//정적 멤버
			static int iisa = 40;
			static void iisaMethod() {
				//iia=iia-10;
//				ia = ia+30;
				isa = isa +40;
//				iaMethod();
				isaMethod();
			}
	}
}
