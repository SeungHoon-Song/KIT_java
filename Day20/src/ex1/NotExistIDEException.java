package ex1;
//아이디가 존재하지 않으면 생성할 사용자 정의 예외 클래스
public class NotExistIDEException extends Exception{
	//기본생성자 만들기
	public NotExistIDEException() {}
	//명시적 생성자 만들기
	public NotExistIDEException(String msg) {
		super(msg);
	}
}
