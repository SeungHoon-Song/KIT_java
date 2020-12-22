package ex9;

public class StringBuilderEx {

	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++) {
			str+=i;	//1 12 123 123...100
		}
		System.out.println(str);
		//개선 코드 작성 위치
		StringBuilder str1 = new StringBuilder();
		for(int i=1;i<=100;i++) {
			str1.append(i);	//1234
		}
		String st = str1.toString();
		System.out.println(st);
		
		
	}

}
