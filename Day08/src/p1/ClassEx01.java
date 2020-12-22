package p1;

public class ClassEx01 {

	public static void main(String[] args) {
		//Sungjuk이라는 클래스를 이용하여 성적처리하는 부분 담당(비즈니스 로직)
		//Sungjuk클래스를 사용하려고 힙메모리에 올리기
		Sungjuk sungjuk = new Sungjuk(100,200);	//sungjuk이라는 변수에 클래스의 주소가 들어있다.(참조변수)
		
		//입력 받는다
		sungjuk.inputMethod();
		//합계-평균-석차
		sungjuk.sumMethod();	//한명의합계
		//한명의평균
		//석차
		
		//출력한다

	}

}
