package p1;
//문자형에서 '\n'
public class LiteralProject {

	public static void main(String[] args) {
		char char_value1 = 'A';
		char char_value2 = '\n';
		char char_value3 = '\t';
		
		/*System.out.print(char_value1);
		System.out.print(char_value2);
		System.out.print(char_value3);
		System.out.print("B");
		
		System.out.printf("%c %c %c %c",char_value1,char_value2,char_value3,'B');*/
		
		//System.out.print(char_value1+char_value2+char_value3+'B');
		
		//System.out.println(); 안에 +기호에 대한 설명
		//아스키코드로 'A' \n \t 'B'	65 10 9  66
		int a = 10;
		int b = 20;
		String word="songseunghoon";
		String word2="Hi!";
		System.out.println(a+b+word+(a+b));
		//문자형 + 정수형 = 문자열형 + 정수형 = 문자형
		System.out.println(word2+" "+word);
		
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		boolean1 = 100<110;
		boolean2 = true && true;
		System.out.println(boolean1 + " "+ boolean2);
		//자료형 기본형:정수형-byte,short,int,long,실수형-float,double,문자형-char,논리형-boolean 
		//자료형 참조형:String(참조형이지만 기본형의 형선언 방식을 따를 수 있다.)
		
		//리터럴 정수: 10진수-123, 8진수-056 , 16진수-0xAF, 실수형-소수점3.14f , 지수형0.3E-7
		//리터럴 문자형-'A' '\n' ,논리형-true false 문자열-"korea"
		

	}

}
