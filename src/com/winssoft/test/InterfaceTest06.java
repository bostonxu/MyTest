package com.winssoft.test;

public class InterfaceTest06 {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		Dog2 dog2 = new Dog2();
		Person person = new Person();
		person.care(cat2);
		person.care(dog2);
	}
}

class Cat2 {
	public void play() {
		System.out.println("miaomiao...");
	}
}

class Dog2 {
	public void play() {
		System.out.println("wangwang...");
	}
}

class Person {
	// “¿¿µπÿœµ
	public void care(Dog2 dog2) {
		dog2.play();
	}

	public void care(Cat2 cat2) {
		cat2.play();
	}
}