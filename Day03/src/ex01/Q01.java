package ex01;

public class Q01 {

	public static void main(String[] args) {
		// 1에서 100까지의 정수 중에서 2, 3, 5, 7의 배수를 제외한 수를 한행에 10개씩 출력하세요.
		int i=1,cnt=0;
		for(i=1;i<=100;i++) {
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 ) {
				cnt++;
			System.out.print(i+"\t");
			}
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
		}
	}
}
