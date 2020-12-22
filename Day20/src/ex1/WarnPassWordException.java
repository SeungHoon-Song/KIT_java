package ex1;
//패스워드가 잘못된 것 처리할 예외
public class WarnPassWordException extends Exception{
	public WarnPassWordException() {}
	public WarnPassWordException(String msg) {
		super(msg);
	}
}
