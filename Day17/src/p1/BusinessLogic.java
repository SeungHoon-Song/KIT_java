package p1;

public class BusinessLogic {
	void start() {
	RemoteControl rc = null;	//인터페이스타입을 참조변수로 사용하기 위해 선언
	
	rc = new SmartTelevision();
	rc.turnOn();
	rc.setVolume(7);
	rc.setMute(true);
	rc.turnOff();
	
	//serch() 호출하기
	//down casting하기
	SmartTelevision sm = (SmartTelevision) rc;
	sm.search("KBS");
	
	//serch() 호출하기
	//down casting하기
	RemoteControl rc1 = new Audio();
	Audio audio = (Audio) rc1;
	audio.search("FM");
	audio.chatting("오디오 객체화 한 자료입니다.");
	}
}
