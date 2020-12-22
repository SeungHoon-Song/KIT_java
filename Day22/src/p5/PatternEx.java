package p5;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		String regExp="(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다. 전화번호 형식O");
		}
		else {
			System.out.println("정규식과 불일치합니다. 전화번호 형식X");
		}
		
		String regExp1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data1 = "angel@naver.com";
		boolean result1 = Pattern.matches(regExp1, data1);
		if(result1) {
			System.out.println("이메일 형식O");
		}
		else {
			System.out.println("이메일 형식X");
		}

	}

}
