package p1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//텍스트 파일 읽기 --> 콘솔 출력 (모니터)
public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:/temp/test1.txt");	//문서자료 읽기
//		FileReader fr = new FileReader("c:/temp/img1.jpg");	//이미지는 읽을 수 없다.
		
		FileWriter fw = new FileWriter("c:/temp/copyTest1.txt");//문서자료 쓰기(저장, 출력)
																//이미지 쓸 수 없다.
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf))!=-1) {
			String data = new String(cbuf,0,readCharNo);
			System.out.println(data);
			fw.write(cbuf,0,readCharNo);
		}
		fw.flush(); //버퍼안에 남아 있는 자료 모두 내보내기
		fw.close();
		fr.close(); //파일 자원 반환
		
		

	}

}
