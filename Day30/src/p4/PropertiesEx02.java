package p4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx02 {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용방법은 java 파일명 input.txt");
			System.exit(0);
		}
		Properties prop = new Properties();
		String inputFile = args[0];
		
		
		try {
			prop.load(new FileInputStream(inputFile));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}

	}

}
