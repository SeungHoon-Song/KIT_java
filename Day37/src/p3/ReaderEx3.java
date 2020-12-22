package p3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx3 {

	public static void main(String[] args) throws IOException {
		//문자를 자바프로그램에서 파일로 보내기(저장하기, 쓰기)
		Writer writer = new FileWriter("c:/temp/fWritwe.txt");
		char[] data = "홍길동".toCharArray();
		writer.write("이순신");
//		for(int i=0;i<data.length;i++) {
//			writer.write(data,1,2);
//		}
		writer.flush();	//버퍼안에 들어 있는 자료 모두 출력하기
		writer.close();	//File 자원 반납
		
	}

}
