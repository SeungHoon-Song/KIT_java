package p3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/output4.txt");
		byte[] data = "ABCDEF".getBytes();
		os.write(data,1,2);	//1번인덱스의 자료부터 2개를 출력해 주어라
//		for(int i=0;i<data.length;i++) {
//			os.write(data[i]);
//		}
		os.flush();
		os.close();
		
	}
}
