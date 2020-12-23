package p2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//버퍼 사용한 것 / 안 한 것이랑 시간 비교

//파일 복사하기 버퍼 이용한 것 / 버퍼 이용하지 않은것
public class InputStreamReaderEx3 {

	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("c:/temp/img1.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() !=-1) {	
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않을 경우 시간 : "+(end-start));
		
		
		FileInputStream fis2 = new FileInputStream("c:/temp/img1.jpg");
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis2.read() !=-1) {
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용한 경우 시간 : "+(end-start));
		
	}

}
