package ex11;

public class StringConvertEx {

	public static void main(String[] args) {
		
		Integer obj1 = 100;	//-128~+127까지는 ==연산자는 값을 비교
		Integer obj2 = 100;
		Integer obj3 = 300;	//==연산자는 주소 비교
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2); //true	(-128~+127까지는 ==연산자는 값을 비교)
		System.out.println(obj3==obj4); //false (-128~+127까지는 ==연산자는 주소 비교)

	}

}
