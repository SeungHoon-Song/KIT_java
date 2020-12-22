package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		 Set<Student> set = new HashSet<Student>();
		   set.add(new Student(1, "홍길동"));
		   set.add(new Student(2, "정현희"));
		   set.add(new Student(3, "최민우"));
		   Iterator<Student> it = set.iterator();
		   while(it.hasNext() ) {
		      Student st = it.next();
		      System.out.println(st.studentNum + ":" + st.name);
		   }
		  }
}