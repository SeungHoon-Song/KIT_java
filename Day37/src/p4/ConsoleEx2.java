package p4;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleEx2 {

	public static void main(String[] args) throws IOException {
		System.out.println("입력하세요==> ");
		InputStream is = System.in;	//콘솔로 입력 받기
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(datas);	//홍길동 + 캐리지리턴(13) + 라인피드(10)
		System.out.println(nameBytes);	//8
		String name = new String(datas, 0, nameBytes-2);
		System.out.println("입력한 이름 : "+name);
		
		
	}

}
