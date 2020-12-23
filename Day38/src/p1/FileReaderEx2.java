package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//텍스트 파일 읽기 --> 콘솔 출력 (모니터)
public class FileReaderEx2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		
		File file = new File("c:/temp/keyIn.txt");
		FileWriter fw = new FileWriter(file,true);
				
		fw.write(inputData);
		fw.flush();
		fw.close();
		
		

	}

}
