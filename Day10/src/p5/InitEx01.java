package p5;

public class InitEx01 {
	
	static final double EARTH_RADIUS = 6400; //상수

	public static void main(String[] args) {
		//인스턴스 메소드를 호출하려면
		//1) 힙메모리에 올린다	2)참조변수,메소드명();
		
		final String nation="USA";	//고정값 캡슐화개념
		//nation = "KOREA";	//변수에 값 변경
		System.out.println(nation);
		
		final double PI;
		PI=3.141592;
		//PI=PI*100;	//변경이니까 에러
		
		System.out.println(4*PI*EARTH_RADIUS*EARTH_RADIUS);
		//EARTH_RAIUS = 7400;	//상수의 값을 변경은 불가능합니다.

		
	}

}
