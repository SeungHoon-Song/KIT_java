package p3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/temp/fRtest1.txt");
		int readData;
		readData = reader.read();	//1문자 읽어오기
		System.out.println((char)readData);
//		while(true) {
//			readData = reader.read();
//			if(readData == -1) break;
//			System.out.println((char)readData);
//		}

	}

}
