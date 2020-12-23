package p7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//역직렬화
public class SerializableReader {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/obj5.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		ClassA v = (ClassA) ois.readObject();
//		System.out.println("field1 : "+v.field1);	//인스턴스 변수
//		System.out.println("field2.field1 : "+v.field2.field1);	//다른 클래스의 인스턴스 변수
//		System.out.println("field3 : "+v.field3);	//정적 직렬화 안됨, 역직렬화(복원) 안됨
//		System.out.println("field4 : "+v.field4);	//treansient 직렬화 안됨
		
		ClassC v = (ClassC) ois.readObject();
		System.out.println("fieldC1 : "+v.fieldC1);	//인스턴스 변수
		System.out.println("fieldC2 : "+v.fieldC2);	//인스턴스 변수
		
		/*//각 클래스의 필드에 내용 넣기
			ClassA classA = new ClassA();
			classA.field1 = 1;	//인스턴스 필드
			classA.field2.field1 = 2;	//ClassB의 필드에 값 넣기
			ClassA.field3 = 3;	//정적 필드
			classA.field4 = 4;
			*/
	}

}
