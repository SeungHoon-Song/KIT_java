package p4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ConsoleEx3 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;	//콘솔 출력 모니터 출력
		
		
		for(byte b=48;b<58;b++) {
			os.write(b);
		}
		os.write(10);	//System.out.println()
		for(byte b=97;b<123;b++) {
			os.write(b);
		}
		os.write(10);	//System.out.println()
		
		String hangul = "가나다라마";
		byte[] hangulByte = hangul.getBytes();
		os.write(hangulByte);
		
		os.flush();
		
	
		
		
	}

}
