package ex01;

public class Ex02 {
	public static void main(String[] args) {
		int i=100,cnt=0;
		do {
			i--;
			if(i%5==0 && i%10!=0) {
				continue;
			}
			System.out.printf("%5d",i);
			cnt++;
			if(cnt==20) {
				System.out.println();
				cnt=0;
			}
			if(i==1)break;
			
		}while(true);
	}
}
//1. 100~1까지 출력	1줄에 20개씩 출력하기
//2. 5의 배수는 출력하지 않기
//3. 5의 배수는 출력하지 않고 10의 배수는 출력하기