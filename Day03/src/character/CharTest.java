package character;

public class CharTest {

	public static void main(String[] args) {
		// CharTest클래스
//		패키지 character에 구현
//		지역변수를 하나 선언하여 문자 'B'를 저장
//		위의 변수를 각각 printBMethod( )로 2번 출력
		
		char char_value = 'B';	//활동 범위는 해당하는 메소드 속에서만 지역변수
		//printBMethod() 호출하기
		printBMethod(char_value);	//메소드 호출하기
		printBMethod(char_value);

	}
	//메소드 만들기(생성하기) pchar_value = char_value
	static void printBMethod(char pchar_value) {
		System.out.println(pchar_value);
//		System.out.println(char_value);     지역변수라 사용 불가능
	}

}
