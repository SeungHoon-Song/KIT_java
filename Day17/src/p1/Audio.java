package p1;

public class Audio implements RemoteControl,Searchable{
	int volume;
	void chatting(String memo) {
		System.out.println(memo);
	}
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV의 볼륨은 "+this.volume+" 입니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
}
