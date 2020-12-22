package p5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE),
				new Student("김수애",6,Student.Sex.FEMALE),
				new Student("신용권",10,Student.Sex.MALE),
				new Student("박수미",6,Student.Sex.FEMALE));
		
		List<Student> totalList1 = Arrays.asList(
				new Student("홍길동",10,Student.City.Pusan),
				new Student("김수애",6,Student.City.Seoul),
				new Student("신용권",10,Student.City.Pusan),
				new Student("박수미",6,Student.City.Seoul));
		
		//남학생들만 묶어서 List생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		System.out.println(maleList);
		maleList.stream().forEach(n->System.out.println(n.getSex()+" "+n.getName()));
		
		//여학생들만 묶어서 List생성
		Set<Student> femaleSet = totalList.stream().filter(s->s.getSex()==Student.Sex.FEMALE)
		.collect(Collectors.toCollection(HashSet::new));
		Iterator<Student> it = femaleSet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getSex()+"~~~");
		}	//Set으로
		femaleSet.stream().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		
		List<Student> femaleList = totalList.stream()
				.filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toList());	//list로
		System.out.println(femaleList);
		femaleList.stream().forEach(n->System.out.println(n.getSex()+" "+n.getName()));
	
		//서울에 사는 사람만 List
		List<Student> seoulList = totalList1.stream()
				.filter(s->s.getCity()==Student.City.Seoul)
				.collect(Collectors.toList());
		System.out.println(seoulList);
		//부산에 사는 사람만 List
		List<Student> pusanList = totalList1.stream()
				.filter(s->s.getCity()==Student.City.Pusan)
				.collect(Collectors.toList());
		System.out.println(pusanList);
		//점수가 8이상만 List
		List<Student> scoreList = totalList.stream()
				.filter(s->s.getScore()>=8)
				.collect(Collectors.toList());
		System.out.println(scoreList);
	}

}
