package p5;

public class ParChiMain {

	public static void main(String[] args) {
		int aa=30;
		//추상클래스의 부모를 익명자식객체로 만든 예제
		Parent p1 = new Parent() {
			int a = 10;
			@Override
			public void ap1() {
				System.out.println("익명 자식 객체 추상메소드"+aa);
				ss();
				a=a+20;
				//aa=aa+10;
				
			}
			public void ss() {
				a=a+30;
				System.out.println(aa);
			}
		};
		
		//일반클래스의 부모를 익명자식객체로 만들기
		Parent2 p2 = new Parent2() {
			int a = 10;
			@Override
			public void p2() {
				// TODO Auto-generated method stub
				super.p2();
			}
			public void s2(){
				a=a+20;
			}
		};	//익명객체라는 표시로 ';' 붙인다.
		
		
//		Child1 c1 = new Child1();	일반적인 방법
//		Child2 c2 = new Child2();
//		c1.p1();
//		c2.c2();
		
		

	}

}
