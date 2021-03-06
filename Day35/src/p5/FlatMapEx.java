package p5;


import java.util.*;

public class FlatMapEx {
	static double sum=0;
	public static void main(String[] args) {
		List<String> list = Arrays.asList("2020/10/05","1999/05/25");
		list.stream().flatMap(data->Arrays.stream(data.split("/")))
		.forEach(word->System.out.print(word+" "));
		System.out.println();
		
		List<String> list2 = Arrays.asList("1.2,2.3","5.5,6.6");
		list2.stream().flatMapToDouble(data ->
		{String[] strArr = data.split(",");
			double[] doubleArr = new double[strArr.length];
			for(int i=0;i<strArr.length;i++) {
				doubleArr[i]=Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(doubleArr);
			}).forEach(n->System.out.print((sum+=n)+" "));

		
	}

}
