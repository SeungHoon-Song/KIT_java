package p1;

public class Ex03 {

	public static void main(String[] args) {
		//1.
//		for(int i=1,sum=0;i<=10;i++) {
//			sum+=i;
//			System.out.printf("%d, %d\n",i,sum);
//		}
		
		//2.
//		for(int i=1,sum=0;i<=10;) {
//			sum+=i++;
//			System.out.printf("%d, %d\n",i,sum);
//		}
		
		//3.
//		for(int i=0,sum=0;i<=9;) {
//			sum+=++i;
//			System.out.printf("%d, %d\n",i,sum);
//		}
		
		//4.
//		for (int i=1, sum=0; i<=10; sum += i++) {
//		System.out.printf("%d, %d\n", i, sum);
//		}
		
		//5.
//		for (int i=0, sum=0; i<=9; sum += ++i) {
//		System.out.printf("%d, %d\n", i, sum);
//		}
		
		//6.
//		int i = 1,sum = 0;
//		do
//		{
//		sum += i++;
//		} while (i <= 10);
//		System.out.printf("%d, %d\n", i, sum);
		
		//7.
//		int i = 1,sum = 0;
//		while (i <= 10)
//		sum += i++;
//		System.out.printf("%d, %d\n", i, sum);
		
		//8.
//		int i = 1, sum = 0;
//		while (i <= 10)
//		sum += ++i;
//		System.out.printf("%d, %d\n", i, sum);
		
		//9.
//		int i = 1;
//		while (i < 3) i += 2;
//		System.out.printf("%d\n", i);
		
		//10.
		int i = 1;
		do
		i += 2;
		while (i < 10);
		System.out.printf("%d\n", i);
		
	}

}
