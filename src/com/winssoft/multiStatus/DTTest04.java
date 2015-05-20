package com.winssoft.multiStatus;

public class DTTest04 {
	public static void main(String[] args) {
		Rose rose = new Rose();
		Dearing dearing = new Dearing();
		Person person = new Person(rose);
		person.test();
		person.findLover(dearing);
		person.test();
	}
}

interface Lover {
	public void getName();
}

class Lily implements Lover {
	public void getName() {
		System.out.println("lily");
	}
}

class Rose implements Lover {
	public void getName() {
		System.out.println("rose");
	}
}

class Dearing implements Lover {
	public void getName() {
		System.out.println("dearing");
	}
}

class Person {
//	private Rose rose;
//	private Dearing dearing;
	private Lover lover;
	
	Person(Lover lover) {
		this.lover = lover;
	}

	public void test() {
		lover.getName();
	}
	
	public void findLover(Lover lover) {
		this.lover = lover;
	}
}