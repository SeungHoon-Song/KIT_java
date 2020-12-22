package p1;

public class Ex04 {

	public static void main(String[] args) {
		//1.
//		for (int i = 1,sum = 0; i <= 10; i++) {
//			sum += i;
//			System.out.println(sum+" ");
//		}
		
		//2.
//		int sum=0;
//		for (int i = 1; i <= 10; i++) {
//		sum += i;
//		System.out.println(sum + " ");
//		}
		
		//3.
//		for (int i = 1; i <= 10; i++) {
//		System.out.println(i + " ");
//		}
		
		//4.
		int i = 1;
		while (i < 10) {
		if (i%2==0)
		continue;
		else
		System.out.println(i++);
		}
		
		//5.
		int j = 1, sum = 0, mult = 1;
		do {
		sum += i; mult *= i;
		}while(++i <= 10);
	}

}
