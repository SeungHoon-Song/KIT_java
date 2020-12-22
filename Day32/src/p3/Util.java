package p3;

public class Util<K, V> {
	// Integer age = Util.getValue(pair, "홍길동");
	//Pair타입과 하위 타입만 받고
	
	public static <P extends Pair<K, V>,K, V> V getValue(P p, K k) {	//Pair타입고 하위타입
		if (p.getKey() == k) {
			return p.getValue();
		} else {
		}
		return null;
	}
}
