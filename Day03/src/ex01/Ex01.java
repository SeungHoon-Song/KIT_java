package ex01;

public class Ex01 {
	public static void main(String[] args) {
		int i=0,cnt=0;
		boolean flag = true;
		while(flag) {
			i++;
			if(i%2==1)
			System.out.printf("%5d",i);
			cnt++;
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
			if(i==100) flag=false;
			
		}
		
	}
}

//1. 1�ٿ� 10���� ��������.
//2. Ȧ���� ���
