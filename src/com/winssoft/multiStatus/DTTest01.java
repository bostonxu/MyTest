package com.winssoft.multiStatus;

public class DTTest01 {
	public static void main(String[] args) {
		Horse horse = new WhiteHorse();
		Animal animal = new Bird();
		animal.talk();
		
		Horse horse2 = new WhiteHorse();
		Horse horse3 = new Black();
	}
}

interface Animal {
	public void talk();
}

class Bird implements Animal {
	@Override
	public void talk() {
		System.out.println("The Spring is coming...");
	}
}

class Horse {
	
}

class WhiteHorse extends Horse {
	
}

class Black extends Horse {
	
}