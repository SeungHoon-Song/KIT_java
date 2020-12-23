package p6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutPutStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//직렬화 모습
		FileOutputStream fos = new FileOutputStream("c:/temp/obj2.dat");	//출력 기반 스트림
		//보조 기반 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1,2,3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush();
		oos.close();
		fos.close();
		
		//역직렬화 모습
		FileInputStream fis = new FileInputStream("c:/temp/obj2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close();
		fis.close();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0]+" "+obj3[1]+" "+obj3[2]);
		System.out.println(obj4);
	}

}
