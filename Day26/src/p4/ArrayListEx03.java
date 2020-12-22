package p4;

import java.util.*;
public class ArrayListEx03 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Student> list2 = new ArrayList<Student>();
		//list1안에 정수형 클래스로 3개 넣기	100	200	300
		list1.add(new Integer(100));
		list1.add(200);
		list1.add(300);
		//list2안에 Student클래스로 3개 넣기 학번2020 2019 2019
		list2.add(new Student("2020","홍길동"));	//0
		list2.add(new Student("2019","이순신"));	//1
		list2.add(new Student("2019","최경희"));	//3
		list2.add(1,new Student("2016","이순신"));	//뒤의 인덱스의 값을 모두 한칸씩 뒤로 옮겨야 하므로 효율성 떨어짐

		//list1에서 1번 인덱스에 100을 넣기
		list1.add(1, 100);
		//list2에서 2번 인덱스에 "2018"넣기
		list2.add(2, new Student("2018","정현희"));
		
		//최경희를 출력해 보세요.
		System.out.println(list2.get(3).getName());
		//"2018"학번 출력해 보세요.
		System.out.println(list2.get(2).getNo());
		
		
		//최경희를 최무선으로 바꿔 보세요.
		list2.get(3).setName("최무선");
		//2018학번을 2017학번으로 바꿔 보세요.
		list2.get(2).setNo("2017");

		System.out.println(list2.get(3).getName());
		System.out.println(list2.get(2).getNo());
		
		//최무선이 몇번 인덱스에 있나요 indexOf()? 3번
		//int nameindex = list2.indexOf("최무선");
		//System.out.println(nameindex);
		int i;
		for(i=0;i<list2.size();i++) {
			if(list2.get(i).getName().equals("최무선"))
				break;
		}
		System.out.println(list2.get(i).getName()+" 찾은 자료");
		
		//2017학번이 몇번 인덱스에 있나요 indexOf()? 2번
		for(i=0;i<list2.size();i++) {
			if(list2.get(i).getNo().equals("2017"))
				break;
		}
		System.out.println(list2.get(i).getNo()+" 찾은 자료2");
	}

}
class Student{
	private String no;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public Student() {
		
	}
	public Student(String no, String name) {
		this.no=no;
		this.name=name;
	}
}