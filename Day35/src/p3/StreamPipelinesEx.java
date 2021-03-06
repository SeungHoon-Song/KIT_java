package p3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelinesEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동",Member.MALE,30),
				new Member("김나리",Member.FEMALE,20),
				new Member("신용권",Member.MALE,45),
				new Member("박수미",Member.FEMALE,27)
				);
		Stream<Member>os  = list.stream();
		double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println("남자 나이의 평균은 : " + ageAvg);
		long femaleCount = list.stream().filter(m -> m.getSex() == Member.FEMALE).mapToInt(Member::getAge).count();
		System.out.println("여자 수 : " + femaleCount);

		//Student
		List<Student> list1 = Arrays.asList(new Student("1반",100,90),
				new Student("2반",80,100),
				new Student("1반",70,50),
				new Student("2반",85,100));
		Stream<Student> stu = list1.stream();
		int kuksum = list1.stream().filter(s->s.getNumclass().equals("1반")).mapToInt(Student::getKuk).sum();
		System.out.println("1반 국어점수 합: "+kuksum);
		int engsum = list1.stream().filter(s->s.getNumclass().equals("2반")).mapToInt(Student::getEng).sum();
		System.out.println("2반 영어점수 합: "+engsum);
		
		int totalkuksum = list1.stream().mapToInt(Student::getKuk).sum();
		System.out.println("모든 반의 국어점수합: "+totalkuksum);
		int totalengsum = list1.stream().mapToInt(Student::getEng).sum();
		System.out.println("모든 반의 영어점수합: "+totalengsum);
		
	}

}
class Member{
	public  static int MALE = 0;
	public  static int FEMALE = 1;
	private String name;
	private int sex;
	private int age;
	public Member(String name,int sex, int age) {
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
}

class Student{
	private String numclass;
	private int kuk;
	private int eng;
	public Student(String numclass, int kuk, int eng) {
		this.numclass=numclass;
		this.kuk=kuk;
		this.eng=eng;
	}
	public void setNumclass(String numclass) {
		this.numclass = numclass;
	}
	public void setKuk(int kuk) {
		this.kuk = kuk;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getNumclass() {
		return numclass;
	}
	public int getKuk() {
		return kuk;
	}
	public int getEng() {
		return eng;
	}
}