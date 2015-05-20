package com.winssoft.test;

public class InterfaceTest07 {
	public static void main(String[] args) {
		// 多态、Upcasting、向上转型
		Pet cat3 = new Cat3();
		Pet dog3 = new Dog3();
		Pet snake = new Snake();
		Person1 person1 = new Person1();
		person1.care(cat3);
		person1.care(dog3);
		person1.care(snake);
		
	}
}

interface Pet {
	public void play();
}

class Cat3 implements Pet {
	@Override
	public void play() {
		System.out.println("miaomiao...");
	}
}

class Dog3 implements Pet {
	@Override
	public void play() {
		System.out.println("wangwang...");
	}
}

class Person1 {
	public void care(Pet pet) {
		pet.play();
	}
}

// 如果此时再加上一个Snake类，则不用再修改Person1类了。
class Snake implements Pet {
	@Override
	public void play() {
		System.out.println("sisi...");
	}
}