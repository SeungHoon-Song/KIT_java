package ex2;

import java.util.Scanner;

import ex1.NotExistIDEException;

public class Salary {
	static Scanner sc = new Scanner(System.in);
	static int money;
	static String sabun;
	
	
	public static void main(String[] args) {
		try {
		give();
		input();
		}catch(SalaryException e) {
			System.out.println(e.getMessage());
		}catch(SabunException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("종료합니다.");
		}
	}

	private static void give() throws SalaryException{
		System.out.print("급여를 입력하세요: ");
		money=sc.nextInt();
		if(money<0) throw new SalaryException("급여는 음수가 될 수 없습니다.");
	}

	private static void input() throws SabunException{
		System.out.print("사번 입력 : ");
		sabun=sc.next();
		if(sabun==null)
			throw new SabunException("사번은 필수 입력입니다.");
		
	}
}
