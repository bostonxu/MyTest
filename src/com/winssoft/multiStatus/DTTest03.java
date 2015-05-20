package com.winssoft.multiStatus;

public class DTTest03 {
	public static void main(String[] args) {
		Animal1 animal1;
		Dog1 dog1 = new Dog1("wangfei");
		animal1 = dog1;
		animal1.play();
		dog1.bark();
		Cat1 cat1 = new Cat1("huahua");
		animal1 = cat1;
		animal1.play();
		cat1.miao();
		
		Animal1[] animal1s = new Animal1[2];
		animal1s[0] = new Dog1("aoao");
		animal1s[1] = new Cat1("mimi");
		
		for (int i = 0; i < animal1s.length; i++) {
			animal1s[i].play();
		}
	}
}

abstract class Animal1 {
	protected String name;

	public Animal1(String name) {
		this.name = name;
	}

	abstract public void play();
}

class Dog1 extends Animal1 {
	public Dog1(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(name + ", is playing...");
	}
	
	public void bark() {
		System.out.println("wangwang...");
	}
}

class Cat1 extends Animal1 {
	public Cat1(String name) {
		super(name);
	}
	@Override
	public void play() {
		System.out.println(name + ", is playing...");
	}
	
	public void miao() {
		System.out.println("miaomiao...");
	}
}