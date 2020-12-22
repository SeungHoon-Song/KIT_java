package p5;

public class Inter1Ex {

	public static void main(String[] args) {
		//익명구현 객체로
		Inter1 i1 = new Inter1() {
			@Override
			public void inter1Method() {
				System.out.println("익명구현 객체 표현하기");
				System.out.println("객체명이 생략된 모습");
			}
		};
		
		//람다식 표현
		Inter1 i2 = ()->{
		System.out.println("람다식 객체 표현하기");
		System.out.println("객체명,메소드명이 생략된모습");
		};
		
		//익명구현 객체의 메소드 호출하기
		i1.inter1Method();
		//람다식으로 메소드 선언한 것 호출하기
		i2.inter1Method();

	}

}
