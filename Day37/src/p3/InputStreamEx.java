package p3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Temp/IStest.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes,1,3);	//배열 크기 2바이트를 읽어온다, 1바이트는 한글이나 특수문자등 unicode자료는 깨짐
		for(int i=0;i<readBytes.length;i++) {
			System.out.println((char)readBytes[i]);
		}
		is.close();
	}
}
