package ex3;

public interface StackInterface {
	int length();	//스택에 들어 있는 문자열 개수 리턴
	String pop();
	boolean push(String ob);	//스택의 톱에 문자열 ob푸시삽입
}
