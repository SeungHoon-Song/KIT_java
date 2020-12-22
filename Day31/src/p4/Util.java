package p4;

public class Util {
	public static <T extends Number>int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		int v2 = t2.intValue();
		byte v3 = t1.byteValue();
		
		return Double.compare(v1, v2);	//v1, v2 같으면 0리턴 작으면-1 크면 1
	}
}
