package ex03_1;

import ex01.Music;
import ex01.Video;

public class ExMain2 {

	public static void main(String[] args) {
		Music music = new Music();
		Video video = new Video();
		video.setPriority(10);
		music.setDaemon(true);

	}
	public synchronized void Music() {
		
	}
	public synchronized void Video() {
		
	}
}

