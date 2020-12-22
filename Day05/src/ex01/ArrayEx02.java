package ex01;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열 선언
		int[] intArray;
		double[] doubleArray;
		boolean[] booleanArray;
		String[] stringArray;
		Student[] stArray;
		
		//배열에 초기값 넣기
		intArray = null;
		doubleArray = null;
		booleanArray = null;
		stringArray = null;
		stArray = null;
		
		//배열을 선언하자 마자 초기값 넣기
		byte[] byteArray = null;
		float[] floatArray = null;
		JavaB[] javaBArray = null;
		
		//실제 값을 넣기		1)new 이용:선언한 후 나중에 넣을 수도 있음		2)초기값으로 바로 넣기: 선언하자마자  바로 값넣기
		//new를 이용해서 넣기 - new로 힙 메모리에 올리고 바로 값을 넣기
		intArray = new int[] {1,2,3};
		doubleArray = new double[] {1.1,2.2,3.3,4.4};
		booleanArray = new boolean[] {true,false,true};
		stringArray = new String[] {"안녕","잘가"};
		stArray = new Student[] {new Student(), new Student(),new Student()};
		
		//new를 이용해서 넣기 2 - new로 힙메모리에 공간을 확보하고 나중에 넣기
		intArray = new int[3];
		doubleArray = new double[4];
		booleanArray = new boolean[3];
		stringArray = new String[2];
		stArray = new Student[3];
		
		//키보드로 입력 받아서 배열 값을 넣기
		//배열명.length : 배열 요소의 값, 배열의 길이
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intArray.length;i++) {
			System.out.print("정수"+(i+1)+"개 입력==>");
			intArray[i] = sc.nextInt();
		}
		
		for(int i=0;i<doubleArray.length;i++) {
			System.out.print("실수"+(i+1)+"개 입력==>");
			doubleArray[i] = sc.nextDouble();
		}
		
		for(int i=0;i<booleanArray.length;i++) {
			System.out.print("논리"+(i+1)+"개 입력==>");
			booleanArray[i] = sc.nextBoolean();
		}
		for(int i=0;i<stringArray.length;i++) {
			System.out.print("문자열"+(i+1)+"개 입력==>");
			stringArray[i] = sc.next();
		}
		
		//배열안에 들어 있는 자료를 출력해 보기
		//방법1. for 출력 
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<doubleArray.length;i++) {
			System.out.print(doubleArray[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<booleanArray.length;i++) {
			System.out.print(booleanArray[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<stringArray.length;i++) {
			System.out.print(stringArray[i]+" ");
		}
		System.out.println();
		
		//방법2. 향상된 for문
		for(boolean booleanVar:booleanArray) {
			System.out.print(booleanVar+" ");
		}
		System.out.println();	//빈줄
		for(String stringVar:stringArray) {
			System.out.print(stringVar+" ");
		}
		
		
	}
}

class JavaB{
	
}
