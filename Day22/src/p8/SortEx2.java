package p8;

import java.util.Arrays;
import java.lang.Comparable;

public class SortEx2 {
	public static void main(String[] args) {
		Member m1 = new Member(5,"홍길동","010-5060-2039");
		Member m2 = new Member(2,"고길동","010-1234-5678");
		Member m3 = new Member(3,"장길동","010-3333-9875");
		Member[] members = {m1,m2,m3};	//객체 배열에 값 넣기
		Arrays.sort(members);
		for(Member m:members) {
			System.out.println(m);
		}
		
		
	}
}
//사용자(프로그래머)가 정렬할 기준을 정해 주는 프로그램 작성
class Member implements Comparable<Member>{
	int sno;	//번호
	String sname;	//회원이름
	String stel;	//전화번호
	@Override
	public String toString() {
		return sno+" "+sname+" "+stel;
	}
	public Member() {
	
	}
	public Member(int sno, String sname,String stel) {
		this.sno=sno;
		this.sname=sname;
		this.stel=stel;
	}
	@Override
	public int compareTo(Member o) {
		//숫자형인 경우 정렬
//		if(sno==o.sno) return 0;
//		else if(sno<o.sno) return -1;
//		else return 0;
		return Integer.compare(sno, o.sno);
	}			
	
}