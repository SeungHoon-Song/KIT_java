package p7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//직렬화하기
public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/obj5.txt");//바이트기반 스트림 파일로 읽을 수 없다.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//각 클래스의 필드에 내용 넣기
		ClassA classA = new ClassA();
		classA.field1 = 1;	//인스턴스 필드
		classA.field2.field1 = 2;	//ClassB의 필드에 값 넣기
		ClassA.field3 = 3;	//정적 필드
		classA.field4 = 4;
		
		ClassC classC = new ClassC();
		classC.fieldC1=100;
		classC.fieldC2=200;
		
		
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();
		
		
		
		
	}

}
