package p2;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[][] score = new int[5][];
		
		score[0] = new int[4];
		score[4] = new int[3];
		score[0] = new int[5];
		
		int[][] score1 = {{1,2},{3,4,5},{6},{7},{8,9}};
		
		String[] strArray = new String[4];
		strArray[0] = "Java";
		strArray[1] = new String("C++");
		strArray[2] = new String("C#");
		strArray[3] = new String("Java");
		
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+" ");
		}
		System.out.println();
		// == 연산자로 주소 strArray[0]이 가지고 있는 주소를 비교	String에서 " "같은 문자열은 불렀던걸로 리턴(new아니면 같음)
		System.out.println(strArray[0]==strArray[3]);
		System.out.println(strArray[1]==strArray[2]);

		//참조변수가 가르키는 값이 같은지 비교하기 equals
		System.out.println(strArray[0].equals(strArray[3]));

		//Student 클래스를 4열 배열에 넣기		String[] strArray = new String[4];
		Student[] studentArray = new Student[4];
		studentArray[0] = new Student();
		studentArray[1] = new Student();
		//==연산자로 [0]==[1]이 같은지 비교하기 답: false
		System.out.println(studentArray[0]==studentArray[1]);
		
		//[0]안에 주소로 가서 그곳에 sa 변수의 값으로 비교
		System.out.println(studentArray[0].sa==studentArray[1].sa);
	}

}

class Student{
	int sa = 10;
}