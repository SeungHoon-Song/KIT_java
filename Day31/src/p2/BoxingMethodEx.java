package p2;

public class BoxingMethodEx {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String stringValue = box2.get();
		System.out.println(stringValue);
		
		Box<Double> box3 = Util.<Double>boxing(1.4);
		
		Box<Tv> box4 = Util.<Tv>boxing(new Tv());
	}

}
class Tv{
	
}