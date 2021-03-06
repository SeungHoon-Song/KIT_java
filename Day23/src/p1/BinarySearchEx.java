package p1;

import java.util.Arrays;

public class BinarySearchEx {
	public static void main(String[] args) {
		try {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 97);
		System.out.println("찾는 자료의 인덱스는 "+index);
		System.out.println(scores[index]);
		
		String[] names = {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		index=Arrays.binarySearch(names, "박동수");
		System.out.println("찾는 자료의 인덱스는 "+index);
		System.out.println(names[index]);
		
		//전화번호가 "123456"인 사람의 이름과 전화번호 출력하기
		Member m1 = new Member(1,"홍길동","22233");
		Member m2 = new Member(3,"김길동","123456");
		Member m3 = new Member(6,"박길동","123445");
		Member m4 = new Member(2,"최길동","777233");
		Member[] m= {m1,m2,m3,m4};
		Arrays.sort(m);	//이름순으로 정렬해줌
		//배열에서 검색이므로
		index=Arrays.binarySearch(m,m2);	//m은 Member클래스 배열 m2
		System.out.println("찾는 자료의 인덱스는 "+index);
		System.out.println(m[index].sname+" "+m[index].stel);		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("찾는 자료가 없습니다.");
		}
	}
}
class Member implements Comparable<Member>{
	int sno;
	String sname;
	String stel;
	public Member() {
		
	}
	public Member(int sno, String sname, String stel) {
		this.sno=sno;
		this.sname=sname;
		this.stel=stel;
	}
	@Override
	public int compareTo(Member o) {
		return sname.compareTo(o.sname);
	}
}