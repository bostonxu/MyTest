package com.winssoft.test;

public class InterfaceTest04 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Horse horse = new Horse();
		Cat cat = new Cat();
		Owner owner = new Owner(dog, horse, cat);
		owner.test();
	}
}

class Dog {
	public void run() {
		System.out.println("Dog is running...");
	}

	public void sleep() {
		System.out.println("Dog is sleepy...");
	}
}

class Horse {
	public void run() {
		System.out.println("Horse is running...");
	}

	public void sleep() {
		System.out.println("Horse is sleepy...");
	}
}

class Cat {
	public void run() {
		System.out.println("Cat is running...");
	}

	public void sleep() {
		System.out.println("Cat is sleepy...");
	}
}

class Owner {
	private Dog dog;
	private Horse horse;
	private Cat cat;

	public Owner() {

	}

	public Owner(Dog dog, Horse horse, Cat cat) {
		this.dog = dog;
		this.horse = horse;
		this.cat = cat;
	}

	public void test() {
		dog.run();
		dog.sleep();
		horse.run();
		horse.sleep();
		cat.run();
		cat.sleep();
	}
}