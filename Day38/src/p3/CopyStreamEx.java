package p3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyStreamEx {

	public static void main(String[] args) throws IOException {
		int data=-1;
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("c:/temp/img1.jpg");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/copyimg1.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() !=-1) {	
			fos1.write(data);
		}
		fos1.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않을 경우 시간 : "+(end-start));
		
		
		FileInputStream fis2 = new FileInputStream("c:/temp/img1.jpg");
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("c:/temp/copyimg1.jpg");
		BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
		start = System.currentTimeMillis();
		while(bis2.read() !=-1) {
			bos2.write(data);
		}
		bos2.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용한 경우 시간 : "+(end-start));

	}

}
