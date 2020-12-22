package ex01;

public class Q11_1 {

	public static void main(String[] args) {
		// 11번 가위 바위 보
		//난수
		double double_random = Math.random();
		//기본은 0.0 <= Math.random() < 1.0
		//1~3까지 랜덤하게 나오는 수를 만들어 보기
		//1단계 원하는 수의 가장 큰 수를 곱함
		//0.0 *3 <= Math.random() *3 <1.0*3
		//0.0 <=Math.random() *3<3.0
		//2다계 정수형을 형변환한다.
		//(int)0.0 <=(int)Math.random() *3<(int)3.0
		//0 <= (int)(Math.random()*3)<3	0~2
		//3단계 각변 1을 더한다.
		//0+1 <= (int)(Math.random()*3)+1<3+1
		//1<=(int)(Math.random()*3)+1<4
		System.out.println((int)(Math.random()*100)+1);

	}

}
//1~100사이의 수가 랜덤하게 나오게 하기
