package p1;

public class Main {

	public static void main(String[] args) {
		//double 실수 8바이트 = int 정수 4바이트
		//다형성
		TV tv1 = new CaptionTV();	//upcasting 자동형변환
		TV tv2 = new AITV();
		
		/*할 수 없다.	왜냐면 힙메모리에는 TV() 부모클래스만 있는데 참조변수는 자식 클래스를 가르쳐야 하니까
		CaptionTV c1 = new TV();
		AITV a1 = new TV();*/
		
		//부모 필드/메소드 모두 사용할 수 있다.
		tv1.power = true;
		tv2.channel = 7;
		tv2.channelUp();
		tv2.channelDown();
		
		//뷰모의 메소드가 아니라 자식의 메소드가 실행되고 싶을 때
		//1. 오버라이딩 된 것은 자신의 메소드가 수행된다.
		tv1.channelUp();
		tv1.channelDown();
		
		//2. 자식의 순수한 메소드를 수행하기
		//tv1.text = "홍길동"; (X)
		//tv1.captionTVMethod();
		CaptionTV ct = (CaptionTV)tv1;	//형변환하여서 변수를 만든다.
		ct.text="홍길동";
		ct.captionTVMethod();
		
//		TV tv3 = new TV();
//		CaptionTV ct2 = (CaptionTV)tv3;
//		ct2.text="이순신";
//		ct2.captionTVMethod();
		
	}

}



////Caption 자식 클래스 인스턴스화 하기
//CaptionTV caption = new CaptionTV();
//caption.channelUp();
//System.out.println(caption.channel);
//
////AITV 자식 클래스의 channelDown()호출, channel 출력
//AITV aitv = new AITV();
//aitv.channelDown();
//System.out.println(aitv.channel);
//
////TV 부모클래스의 channelUp()호출, channel 출력
//TV tv = new TV();
//tv.channelUp();
//System.out.println(tv.channel);
