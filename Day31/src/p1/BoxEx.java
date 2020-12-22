package p1;

public class BoxEx {

	public static void main(String[] args) {
		/*Box box1 = new Box();
		box1.setObject("사과");
		box1.setObject("포도");
		box1.setObject(new Apple());
		box1.setObject(123);
		
		Box box2 = new Box();
		box2.setObject("바나나");
		box2.setObject("갈비");*/
		Box box1 = new Box();
		Box<Apple> box2 = new Box<Apple>();
		box2.set(new Apple());
//		box2.set(new Banana());	Apple클래스만 넣을 수 있는 곳에 Banana를 넣어서
		//box2.set("홍길동"); 강력한 타입, 컴파일 에러
		
		Box<Banana> box3 = new Box<Banana>();
		box3.set(new Banana());
//		box3.set(new Apple());
		
		

	}

}
