package p2;

public class WrapperEx {
	public static void main(String[] args) {
		//Boxing
		int i = 100;
		Integer ii = new Integer(100);
		
		float f = 10.5f;
		Float ff = new Float(10.5f);
		
		char c = 'a';
		Character cc = new Character('a');
		
		boolean b = true;
		Boolean bb = new Boolean(true);
		
		//Unboxing
		byte bii = ii.byteValue();
		int iv = ii.intValue();
		double dv = ii.doubleValue();
		float fv =ii.floatValue();
		System.out.println(bii+" "+iv+" "+dv+" "+fv);
		
		//숫자 정수형 <-> 실수형
		byte bff = ff.byteValue();
		int iff = ff.intValue();
		double dff = ff.doubleValue();
		float fff = ff.floatValue();
		System.out.println(bff+" "+iff+" "+dff+" "+fff);
		
		//bb 언박싱
		boolean bv = bb.booleanValue();
		
	}
}
