package ex01;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// 1부터 n까지 합 중에서 5000을 넘지 않는 가장 큰 합과 그때에 n을 구하는 프로그램 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요: ");
		int n = sc.nextInt();
		int i;
		int tot=0;
		for(i=1;i<=n;i++) {
				tot+=i;
			if(tot>=5000) {
				tot-=i;
				break;
			}
		}
		i-=1;
		System.out.println("1부터"+n+"까지 합 중에서 5000을 넘지 않는 가장 큰 합: "+tot+" 그때에 n:"+i);
		

	}

}
