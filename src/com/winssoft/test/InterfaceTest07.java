package com.winssoft.test;

public class InterfaceTest07 {
	public static void main(String[] args) {
		// ��̬��Upcasting������ת��
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

// �����ʱ�ټ���һ��Snake�࣬�������޸�Person1���ˡ�
class Snake implements Pet {
	@Override
	public void play() {
		System.out.println("sisi...");
	}
}