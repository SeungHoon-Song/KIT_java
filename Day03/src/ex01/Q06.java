package ex01;

public class Q06 {

	public static void main(String[] args) {
//		다음 식을 참고로 섭씨 온도(C)를 화씨 온도(F)로 변환하는 프로그램을 다음과 같은 출력이 나오도록 작성하시오.
//		F = (9.0 / 5.0 ) * C + 32;​
//		섭씨 온도가 -60 ~140까지 20씩 증가, 이 때 화씨온도를 구하여 출력하는 온도는 모두 정수 형태로 출력
		for(double i=-60;i<=140;i+=20) {
			System.out.println("섭씨온도:"+i+"화씨온도:"+(int)((9.0 / 5.0 ) * i + 32));
		}
	}

}
