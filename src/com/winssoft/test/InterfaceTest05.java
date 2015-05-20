package com.winssoft.test;

public class InterfaceTest05 {
	public static void main(String[] args) {
		// 面向接口编程
		// 面向抽象编程
		// 依赖注入：DI
		// OCP原则:open close principle
		Animal1 animal = new Dog1();
		Owner1 owner1 = new Owner1(animal);
		owner1.test();
		owner1.setAnimal(new Cat1());
		owner1.test();
	}
}

interface Animal1 {
	public void run();

	public void sleep();
}

class Cat1 implements Animal1 {

	@Override
	public void run() {
		System.out.println("Cat is running...");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleepy...");
	}

}

class Dog1 implements Animal1 {

	@Override
	public void run() {
		System.out.println("Dog is running...");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleepy...");
	}

}

class Horse1 implements Animal1 {

	@Override
	public void run() {
		System.out.println("Horse is running...");
	}

	@Override
	public void sleep() {
		System.out.println("Horse is sleepy...");
	}

}

class Owner1 {
	// 关联关系
	private Animal1 animal;

	public Owner1(Animal1 animal) {
		this.animal = animal;
	}

	public void setAnimal(Animal1 animal1) {
		this.animal = animal1;
	}

	public void test() {
		animal.run();
		animal.sleep();
	}

}