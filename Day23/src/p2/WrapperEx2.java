package p2;

public class WrapperEx2 {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "1234";
		String s3 = "123-435";
		String s4 = "10.45";
		String s5 = "10000";
		String s6 = "true";
		//문자열 "1234" --> 숫자
		int ip=Integer.parseInt(s2);
		double dp = Double.parseDouble(s4);
		long lp = Long.parseLong(s5);
		boolean bp = Boolean.parseBoolean(s6);
		System.out.println(ip+" "+dp+" "+lp+" "+bp);
		
		int i1 = 100;
		double d1 = 10.5;
		boolean b1 = true;
		char c1= 'a';
		byte by1 = 1;
		
		String si1 = Integer.toString(i1);	//"100"
		String sdi1 = Double.toString(d1);	//"10.5"
		System.out.println(si1+sdi1);

	}

}
