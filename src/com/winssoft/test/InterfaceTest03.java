package com.winssoft.test;

public class InterfaceTest03 {
	public static void main(String[] args) {
		MediaPlayer mediaPlayer = new MediaPlayer();
		mediaPlayer.playMusic();
		mediaPlayer.playVideo();
		System.out.println("Aloha");
	}
}

interface MP3 {
	public void playMusic();
}

interface Video {
	public void playVideo();
}

class MediaPlayer implements MP3, Video {

	@Override
	public void playVideo() {
		System.out.println("left eye");
	}

	@Override
	public void playMusic() {
		System.out.println("meilanfang");
	}

}