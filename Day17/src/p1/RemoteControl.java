package p1;
//구현클래스의 부모로 사용할 필드나 메소드
public interface RemoteControl {
	static final int MAX_VOLUME = 10;	//상수
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
}
