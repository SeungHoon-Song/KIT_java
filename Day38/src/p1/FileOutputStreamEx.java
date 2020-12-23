package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//파일복사
public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		String originalFileName = "c:/temp/test1.txt";
		String targetFileName = "c:/temp/copytest1.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("파일을 복사했습니다.");
		
		
	}

}
