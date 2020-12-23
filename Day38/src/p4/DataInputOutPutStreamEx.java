package p4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutPutStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:/temp/test2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		dos.writeBoolean(true);
		
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		dos.writeBoolean(false);
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/test2.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<2;i++) {
			String name = dis.readUTF();
			Double score = dis.readDouble();
			int rank = dis.readInt();
			boolean b = dis.readBoolean();
			System.out.println(name+" "+score+" "+rank+" "+b);
		}
		dis.close();
		fis.close();
	}

}
