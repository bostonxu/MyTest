package com.winssoft.test;

public class InterfaceTest08 {
	public static void main(String[] args) {
		Cheng c1 = new WhiteHorse();
		Cheng c2 = new BlackHorse();
		Cheng c3 = new GrayHorse();
		Rider rider = new Rider();
		rider.ride(c1);
		rider.ride(c2);
		rider.ride(c3);
	}
}

interface Cheng {
	public void cheng();
}

class WhiteHorse implements Cheng {

	@Override
	public void cheng() {
		System.out.println("Ride white horse...");
	}
	
}

class BlackHorse implements Cheng {
	@Override
	public void cheng() {
		System.out.println("Ride black horse...");
	}
}

class Rider {
	// �������ý�������ϵ
	// �ڲ����Խй�����ϵ
	public void ride(Cheng maCheng) {
		maCheng.cheng();
	}
}

class GrayHorse implements Cheng {
	@Override
	public void cheng() {
		System.out.println("Ride gray horse...");
	}
}