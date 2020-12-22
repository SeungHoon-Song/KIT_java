package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByAndReductionEx {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE,Student.City.Pusan),
				new Student("김수애",6,Student.Sex.FEMALE,Student.City.Seoul),
				new Student("신용권",10,Student.Sex.MALE,Student.City.Pusan),
				new Student("박수미",6,Student.Sex.FEMALE,Student.City.Seoul),
				new Student("박수호",6,Student.Sex.MALE,Student.City.Seoul)
				);
		//성별로 평균 점수 구하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,
						Collectors.averagingDouble(Student::getScore)));
		
		System.out.println("남학생 평균 점수: "+mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균 점수: "+mapBySex.get(Student.Sex.FEMALE));
		
		//성별로 인원수 구하는 Map 얻기
		Map<Student.Sex, Long> mapBySexC = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,
						Collectors.counting()));
		System.out.println("남학생 인원수: "+mapBySexC.get(Student.Sex.MALE));
		System.out.println("여학생 인원수: "+mapBySexC.get(Student.Sex.FEMALE));
		
		//성별을 쉼표로 구분하는 이름을 저장하는 Map 얻기
		//출력결과 남학생 전체 이름 : 홍길동, 신용권, 박수호		여학생 전체 이름 : 김수애, 박수미
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,
						Collectors.mapping(Student::getName, Collectors.joining(","))));
		System.out.println("남학생 전체 이름: "+mapByName.get(Student.Sex.MALE));
		System.out.println("여학생 전체 이름: "+mapByName.get(Student.Sex.FEMALE));
	
	}

}
