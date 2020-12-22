package p1;

import java.util.Calendar;
import data.SingleToneClass;
import data.Sungjuk;

public class MainEx01 {

	public static void main(String[] args) {
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.setHakbun(202010);
		System.out.println(sungjuk.getHakbun());
		sungjuk.setName("송승훈");
		System.out.println(sungjuk.getName());

		//객체화 하기
//		SingleToneClass singletone = new SingleToneClass();	//접근 못함 이유:생성자가 private라서
		SingleToneClass singleToneAddr1 = SingleToneClass.getInstace();	//클래스 메소드이므로 클래스명,메소드명()으로 접근함
		SingleToneClass singleToneAddr2 = SingleToneClass.getInstace();
		SingleToneClass singleToneAddr3 = SingleToneClass.getInstace();
		
		System.out.println(singleToneAddr1);
		System.out.println(singleToneAddr2);
		System.out.println(singleToneAddr3);
		
		Calendar ca = Calendar.getInstance();
		
	}

}
