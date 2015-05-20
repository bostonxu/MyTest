package com.winssoft.test;

public class InterfaceTest02 {
	public static void main(String[] args) {
		MP3MobilePhone phone = new MP3MobilePhone();
		phone.play();
		phone.talk();
		MP3Player mp3 = new MP3Player();
		mp3.play();
		System.out.println("=================");
		MobilePhone mobilePhone = new MP3MobilePhone();
		mobilePhone.play();
		mobilePhone.talk();
		MP31 mp31 = new MP3MobilePhone();
		mp31.play();
		
	}
}

interface MP31 {
	public void play();
}

interface MobilePhone extends MP31 {
	public void talk();
}

class MP3MobilePhone implements MobilePhone {

	@Override
	public void play() {
		System.out.println("play music...");
	}

	@Override
	public void talk() {
		System.out.println("talking to others...");
	}
	
}

class MP3Player implements MP31 {

	@Override
	public void play() {
		System.out.println("play the music in mp3...");
	}
	
}