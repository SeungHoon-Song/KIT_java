package p3;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");

		Util util = new Util();
		boolean result = util.compare(p1, p2);
		System.out.println(result);
		if (result)
			System.out.println("논리적으로 동등한 객체");
		else
			System.out.println("논리적으로 동등하지 않은 객체");

		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		result = util.compare(p3, p4);
		System.out.println(result);
		if (result)
			System.out.println("논리적으로 동등한 객체");
		else
			System.out.println("논리적으로 동등하지 않은 객체");

		Pair<Integer, Boolean> p5 = new Pair<Integer, Boolean>(10, true);
		Pair<Integer, Boolean> p6 = new Pair<Integer, Boolean>(10, false);
		result = util.compare(p5, p6);
		System.out.println(result);
		if (result)
			System.out.println("논리적으로 동등한 객체");
		else
			System.out.println("논리적으로 동등하지 않은 객체");

		Pair<Car, Integer> p7 = new Pair<Car, Integer>(new Car("소나타"), 10);
		Pair<Car, Integer> p8 = new Pair<Car, Integer>(new Car("소나타"), 10);
		System.out.println("동등한 객체인가요? : " + util.compare(p7, p8));

	} // end main
} // end class

class Car{
	   
	   String name;
	   public Car(String name) {
	      this.name=name;
	      
	   }
	   @Override
	   public int hashCode() {
	      /*final int prime = 31;
	      int result = 1;
	      result = prime * result + ((name == null) ? 0 : name.hashCode());  천기훈씨 코드*/
	      
	      return name.hashCode();
	   }
	   @Override
	   public boolean equals(Object obj) {
	      if(obj instanceof Car) {
	         Car car = (Car) obj;
	         if(name.equals(car.name)) return true;
	      }
	      return false;
	      
	      }
	}
