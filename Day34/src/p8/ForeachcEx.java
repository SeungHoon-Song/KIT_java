package p8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ForeachcEx {

	public static void main(String[] args) {
		//반복자
		List<String> list= Arrays.asList("홍길동","정현희","김자바","람다식","박병렬","정현희");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("---- 스트림 순차처리 ----");
		//반복자 forEach()
		List<String> list2 = Arrays.asList("이순신","최경미","이수근","박미숙","람다식","박병렬","정현희");
		Stream<String> stream2 = list2.stream();	//스트림 = 액체 , 흘러 가는 자료
		stream2.forEach(name->System.out.println(name));
//		Consumer i;
		System.out.println("---- 스트림 병렬 처리하기 ----");
		Stream<String> parallelStream2 = list2.parallelStream();
		parallelStream2.forEach(t->System.out.println(t));
		
	}

}
