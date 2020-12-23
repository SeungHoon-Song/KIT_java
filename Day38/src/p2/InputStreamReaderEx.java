package p2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class InputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:/tmep/fileOutput.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "데이터 출력 스트림을 문자 출력 스트림을 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();
		
	}

}
