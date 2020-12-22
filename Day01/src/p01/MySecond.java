package p01;

public class MySecond {
	//정수형 변수 선언과 리터럴
	static byte byte_value=-128;	//변수의 초기화 필드	-128 ~ +127까지의 정수표현
	static int int_value=012;	//4바이트 이므로 -2,147,483,648 ~ +2,147,483,647까지의 정수표현
	static long long_value=0xadL;// 0x 16진수 L longtype
	static char char_value=97;	//아스키코드 값을 넣으면 아스키 코드 문자를 출력한다.
	static short short_value=100;	//-32768 ~ +32767까지의 정수 표현
	
	//실수형 변수 선언과 리터럴
	static float float_value = 3.12345678901f,float_value2 = -5.2f;		//실수형 4바이트
	static double double_value = 3.1234567890123456,double_value2 = 5E7;		//실수형 8바이트 기본형입니다. 부동소숫점 표현방식
	//double형과 float형은 소숫점이하를 얼마나 정밀하게 표현하느냐이다. 소수점 6자리까지 정밀하게 표현 -float
	//double 16자리까지는 정밀하게 출력되나 나머지 소숫점은 절삭하여 처리하지 못합니다.
	
	//문자형
	static char char_value1='A';
	static char char_value2='\n'; //제어문자
	static char char_value3='\t';
	static char char_value4='\'';	// \다음에 특수문자를 출력하려고 할 때 사용
	
	
	public static void main(String[] args) {
		
		
		
		System.out.printf("%d\n",byte_value);		//10진수로 출력
		System.out.printf("%o\n",int_value);		//8진수로 출력
		System.out.printf("%x\n",long_value);		//16진수로 출력
		System.out.println(char_value);
		System.out.println(short_value);
		System.out.println(float_value+" "+float_value2);
		System.out.println(double_value+" "+double_value2);
		System.out.println(char_value1+char_value2+"ㅁㅁ"+char_value3+char_value4);
		
		
		//교재 32쪽 참고
	}
}


class Student{
	
}
class Teacher{
	
}
