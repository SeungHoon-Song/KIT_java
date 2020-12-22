package p2;

import java.io.IOException;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//랜덤수 스트림 얻기
public class FromArrayEx5 {
	
	public static void main(String[] args) throws IOException{
		Random r = new Random();
		IntStream is = r.ints();
//		is.forEach(a->System.out.println(a));
		
		LongStream ls = r.longs();
//		ls.forEach(a->System.out.println(a));
		
		DoubleStream ds = r.doubles();
		ds.forEach(a->System.out.println(a));
		
		
	}

}
