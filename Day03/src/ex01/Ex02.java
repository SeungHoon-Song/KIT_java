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
//1. 100~1���� ���	1�ٿ� 20���� ����ϱ�
//2. 5�� ����� ������� �ʱ�
//3. 5�� ����� ������� �ʰ� 10�� ����� ����ϱ�