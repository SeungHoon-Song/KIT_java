package p6;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		char[] charArr1= {'J','A','V','A'};
		byte[] byteArr1= {1,0,1};
		double[] doubleArr1= {1.1,2.2,3.3,4.4,5.5};
		Car[] carArr1= {new Car(),new Car()};
		
		int[] intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		//int[] intArr1 = {1,2,3};
		
		char[] copyChar = Arrays.copyOf(charArr1, charArr1.length);
		byte[] copyByte = Arrays.copyOf(byteArr1, 2);
		double[]copyDouble = Arrays.copyOf(doubleArr1, doubleArr1.length);
		Car[] copyCar = Arrays.copyOf(carArr1, carArr1.length);
		int[] copyInt = Arrays.copyOf(intArr1, intArr1.length);
		
		for(char c:charArr1) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("copy자료");
		for(char c : copyChar) {
			System.out.print(c+" ");
		}
		
		for(byte b:byteArr1) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("copy자료");
		for(byte b : copyByte) {
			System.out.print(b+" ");
		}
		System.out.println();
		
		double[] dcor = Arrays.copyOfRange(doubleArr1, 2, 4);
		for(double d:dcor) {
			System.out.print(d+" ");
		}
		System.out.println();
		
		char[] arr4 = new char[charArr1.length];	//[4]
		char[] arr5 = {'P','r','o'};
		char[] arr6 = new char[8];
		
		System.arraycopy(charArr1, 0, arr4, 0, charArr1.length);//J A V A
		for(char a : arr4) {
			System.out.print(a+" ");
		}
		System.out.println();
		//J a v a P r o 출력하게
		System.arraycopy(arr4, 0, arr6, 0, 4);	//J A V A
		System.arraycopy(arr5, 0, arr6, 4, 3);	//J A V A P r o
		for(char a : arr6) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		char[] arr7 = {'T','h','i','s',' ','i','s',' ','a',' ','b','o','o','k'};
		char[] arr8 = new char[5];
		System.arraycopy(arr7, 2, arr8, 0, 2);
		System.arraycopy(arr7, 11, arr8, 3, 2);
		for(char a:arr8) {
			System.out.print(a);
		}
		
	}
}
class Car{
	
}


//This is a book ==> isooT
