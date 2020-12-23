package p8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerialzableEx {

	public static void main(String[] args) throws Exception {
		//직렬화하기
		FileOutputStream fos = new FileOutputStream("c:/temp/nonObj.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1="부모 이름";
		child.field2="자식 이름";
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();
		
		//역직렬화하기
		FileInputStream fis = new FileInputStream("c:/temp/nonObj.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child child2 = (Child) ois.readObject();
		System.out.println(child2.field1);
		System.out.println(child2.field2);

	}

}
