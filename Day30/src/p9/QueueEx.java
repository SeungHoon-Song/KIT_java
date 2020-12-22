package p9;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

//선입선출, 선착순 구조의 프로그램 작성할 때 이용
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> mq = new LinkedList<Message>();
		Set<Message> mset = new HashSet<Message>();
		Collection<Message> cm = Collections.synchronizedCollection(mq);
		Collections.synchronizedSet(mset);
		
		Map<String,Integer> ccmap = new ConcurrentHashMap<String, Integer>();
		ccmap.put("a", 1);	//병렬처리됨 스레드
		
		Queue<Message> ccLQ = new ConcurrentLinkedQueue<Message>();
		ccLQ.offer(new Message("sendMail", "홍길동"));
		
		mq.offer(new Message("sendMail","홍길동"));
		mq.offer(new Message("sendSMS","신용권"));
		mq.offer(new Message("sendKakaotalk","홍두께"));
		System.out.println(mq.isEmpty());
		while(!mq.isEmpty()) {
			Message m = mq.poll();
			System.out.println(m);
		}
		System.out.println(mq.isEmpty());
	}

}
class Message{
	String command;
	String to;
	public Message(String command, String to) {
		this.command=command;
		this.to=to;
	}
	@Override
	public String toString() {
		return command+" "+to;
	}
}
