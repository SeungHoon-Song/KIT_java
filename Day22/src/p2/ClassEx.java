package p2;

public class ClassEx {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();	//생성자가 없는 경우의 클래스 Api사용예
		String name = clazz1.getName();
		String sname = clazz1.getSimpleName();
//		Package pack = clazz1.getPackage();
//		String na = pack.getName();
		String na = clazz1.getPackage().getName();
		System.out.println(clazz1);
		System.out.println(name);
		System.out.println(sname);
		System.out.println(na);

	}

}
class Car{
	
}