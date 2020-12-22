package ex1;

import java.util.Scanner;

public class LoginExample {
	static String id=null;
	static String password=null;
	
	public static void main(String[] args) {
		try {
		input();
		Login();
		}catch(NotExistIDEException e) {
			System.out.println(e.getMessage());
		}catch(WarnPassWordException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("5초후에 자동 로그아웃 합니다.");
			
		}
		

	}

	private static void Login() throws NotExistIDEException,WarnPassWordException{
		if(!id.equals("admin")) {
			//예외 발생 시키기
			throw new NotExistIDEException("예외발생 예외발생 아이디가 틀렸습니다.");
		}
		if(!password.equals("admin1234")) {
			throw new WarnPassWordException("패스워드가 틀렸습니다. 혹시 해커인가요?");
		}
			
		
	}

	private static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 :");
		id = sc.next();
		System.out.print("패스워드 : ");
		password = sc.next();
	}

}
