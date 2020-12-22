package p4;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1),"홍길동");	//해쉬맵이라는 상자안에 자료를 넣기
		String value = hashMap.get(new Key(1));	//key를 넣으면 value출력
		System.out.println(value);
	}
}
