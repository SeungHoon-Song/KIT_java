package p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


//디렉터리로부터 스트림 얻기
public class FromArray4 {

	public static void main(String[] args) throws IOException{
//		Path path = Paths.get("src/p2/FormArray3.java");
		Path path = Paths.get("C:\\Program Files\\Java\\jdk1.8.0_261");
		Stream<Path> stream;
		
		stream = Files.list(path);
		stream.forEach(p->System.out.println(p.getParent()));
		
		//BufferedReader.lines()를 이용해서 파일 스트림으로 얻기
//		File file = path.toFile();
//		FileReader fileReader = new FileReader(file);
//		BufferedReader br = new BufferedReader(fileReader);
//		Stream<String> stream2 = br.lines();
//		stream2.forEach(System.out::println);

	}

}
