package ex01;

public class ArrayEx03 {

	public static void main(String[] args) {
		//int 배열 선언 --> 7요소
		int[] intArray1;	//스택메모리에 올라가는 참조변수는 초기값이 안채워진다.
		intArray1 = new int[7];	//힙메모리에 올라가는 배열요소안에는 기본값으로 채워진다.
		
		for(int intVar:intArray1) {
			System.out.print("intVar->"+intVar+" ");
		}
		System.out.println();
		
		for(int i=0;i<intArray1.length;i++) {
			System.out.print(intArray1[i]+" ");
		}
		System.out.println();
		
		//boolean 배열 선언하고 배열의 요소 3을 준다. 그리고 출력해본다. 초기값이 false확인
		boolean[] booleanArray;
		booleanArray = new boolean[3];
		for(boolean booleanVar:booleanArray) {
			System.out.print("boolean->"+booleanVar+" ");
		}
		System.out.println();
		
		//Student 클래스를 만들고 클래스를 배열로 선언한다. 배열의 요소 3개로 준다.
		Student[] stArray;
		stArray = new Student[3];
		for(Student stVar:stArray) {
			System.out.print("Student->"+stVar+" ");
		}
		
		//InterEx 인터페이스를 만들고 배열로 선언하고 배열 요소 2개로 준다.
		System.out.println("인터페이스의 배열 초기값");
		InterEx[] ItfArray;
		ItfArray = new InterEx[2];
		for(int i=0;i<ItfArray.length;i++) {
			System.out.print("ItfArray->"+ItfArray[i]+" ");
		}
		
		//초기값 넣는 방법1 - new 연산자를 이용
		//초기값 넣는 방법2 - 선언하자마자 바로 넣기
		int[] intArray2 = {1,2,3,4,5};
		double[] doubleArray2 = {1.1,2.2,3.3};
		
		System.out.println(intArray2.length);
		System.out.println(doubleArray2.length);

	}

}
interface InterEx{
	
}
