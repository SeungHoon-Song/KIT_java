package p4;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleEx {

	public static void main(String[] args) throws IOException {
		System.out.print("입력하세요==> ");
		InputStream is = System.in;	//콘솔로 입력 받기
		char inputChar = (char) is.read();
		System.out.println("출력: "+inputChar);

	}

}
