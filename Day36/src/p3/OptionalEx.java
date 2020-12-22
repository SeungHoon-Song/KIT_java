package p3;

import java.util.*;

public class OptionalEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*double avg = list.stream().mapToInt(Integer::intValue)
				.average().getAsDouble(); 오류남 이유 컬렉션에 자료 없음*/
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			System.out.println("방법1 평균: "+optional.getAsDouble());
		}
		else {
			System.out.println("방법1 평균: 0.0");
		}
		
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2 평균: "+avg);
		
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println("방법3 평균: "+a));
		
		
	}

}
