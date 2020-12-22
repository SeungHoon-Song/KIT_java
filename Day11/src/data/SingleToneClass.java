package data;

public class SingleToneClass {
	private static SingleToneClass singleTone = new SingleToneClass();
	
	private SingleToneClass() {
		System.out.println("싱글톤 클래스의 생성자 부분");
	}
	
	public static SingleToneClass getInstace() {
		return singleTone;	//참조변수 리턴
	}
	
}
