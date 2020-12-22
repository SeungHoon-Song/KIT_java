package p3;

public class LocalMemberOutter {
	int ia = 10;
	void iaMethod() {//내부 클래스 멤버 사용하기 못함
		System.out.println("이곳은 외부클래스의 메소드 부분입니다."+ia);
	}
	//정적 멤버
	static int isa = 20;
	static void isaMethod() {}
	
	void innerMethod() {
		int ii = 10;	//자동으로 final 처리됨
//		ii = ii+10;
		
		class LocalInner{
			//클래스 정의
			int inna=10;
			//ii=ii+20;	변경이 안됨 자바 문법으로 막음
			
			
			//ia = ia + 10;	수정(변경) 안됨
			void iinaMethod() { 
				ia=ia+10;
//				ii=ii+20; 
				System.out.println(ii);
				System.out.println("이곳은 로컬이너클래스 부분입니다.");
			}
			//static innsa = 20;
			//static iinsaMethod(){ }
			public LocalInner() {}
			
			
		}//end LoclaInner
		
		//localInner클래스를 객체화 시켜서 실행하는 코드 작성
		LocalInner li = new LocalInner();
		li.inna = li.inna+20;
		li.iinaMethod();
		
		
	}//end innerMethod()
}
