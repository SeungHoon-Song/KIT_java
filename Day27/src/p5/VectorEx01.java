package p5;

import java.util.*;

public class VectorEx01 {

	public static void main(String[] args) {
		List<Board> list1 = new Vector<Board>();
		//넣기 추가
		list1.add(new Board("제목1","내용1","글쓴이1"));
		list1.add(new Board("제목2","내용2","글쓴이2"));
		list1.add(new Board("제목3","내용3","글쓴이3"));
		list1.add(new Board("제목4","내용4","글쓴이4"));
		list1.add(new Board("제목5","내용5","글쓴이5"));
		
		//수정하기 3번인덱스를 바꾸기 제목6
		list1.set(3, new Board("제목6","내용6","글쓴이6"));
		//중간 삽입하기 2번인덱스 제목7
		list1.add(2, new Board("제목7","내용7","글쓴이7"));
		//제목2가 있는지 확인하기
		boolean b = list1.get(1).subject.equals("제목2");
		System.out.println(b);
		//삭제하기 4번 인덱스
		list1.remove(4);
		
		//전체 출력하기 1
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i)+" "+list1.get(i).subject);
		}
		//전체 출력하기 2 - 반복자를 사용하기
		System.out.println("=================");
		Iterator<Board> iterator = list1.iterator();
		while(iterator.hasNext()) {	//list1안에 자료 제목1, ...,제목5
			Board board = iterator.next();
			System.out.println(board+" "+board.subject);
		}
		
		System.out.println("=================");
		System.out.println("용량크기, 저장된 값의 개수, trim");
		//다형성으로 정의 되어 있어서 부모(List)의 메소드만 쓸 수 있다. 그러므로 형의 down casting하기
		Vector<Board> vlist= (Vector)list1;
		int ca = vlist.capacity();
		System.out.println("기본 기억용량 : "+ca);
		vlist.trimToSize();
		ca = vlist.capacity();
		System.out.println("트림한 기억용량 : "+ca);
		
		Vector<String> v1 = new Vector();
		Vector<String> v2 = new Vector(15);
		ca = v1.capacity();
		System.out.println("v1 기본 기억용량 : "+ca);
		ca = v2.capacity();
		System.out.println("v2 기본 기억용량 : "+ca);

	}

}
class Board{
	String subject;
	String content;
	String writer;
	public Board() {
		
	}
	public Board(String subject, String content, String writer) {
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}
}
