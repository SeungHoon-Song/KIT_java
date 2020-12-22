package ex01;

public class ArrayEx01 {
	public static void main(String[] args) {
		String name1 = "송승훈";
		String name2 = "송승훈";
		
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		//name3의 가르키는 값과 name4가 가르키는 값이 같은지 비교하기
		if(name3.equals(name4))	System.out.println("같은 이름");
		else System.out.println("다른 이름");
		//==연산자는 기본형인 경우에 같은 것 !=는 기본형인 경우에 같지 않은 것을 의미한다.
		//참조형인 경우 ==은 참조형이 가지고 있는 주소를 비교하기한다.
		if(name3==name4)	System.out.println("같은 주소");
		else System.out.println("다른 주소");
	}
}
class Student{
	
}
