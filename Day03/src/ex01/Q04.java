package ex01;

public class Q04 {

	public static void main(String[] args) {
//		다음 수식과 내용을 참고로 해당하는 x와 y값을 출력하는 프로그램을 작성하시오.
//		y = 4x^3 + 5x^2 + x + 2, x는 5에서 10사이 0.5씩 증가하도록
		
		
		//4번 방정식을 구하는 프로그램 나중에 빅데이터 알고리즘에서 방정식을 도출하여 학습하는 과정과 비슷함
		//데이터를 만들어서 인공지능 프로그램에 학습을 시킴
		double y;
		for(double x=5; x<=10; x+=0.5) {
			y=4*x*x*x + 5*x*x + x +2;
			System.out.println("x="+x+"\ty="+y);
		}

	}

}
