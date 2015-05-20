package com.winssoft.multiStatus;

public class DTTest02 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Orange orange = new Orange();

//		AppleGardener appleGardener = new AppleGardener();
//		appleGardener.care(apple);
//		OrangeGardener orangeGardener = new OrangeGardener();
//		orangeGardener.care(orange);
		// 里氏代换原则
		Gardener gardener = new Gardener();
		gardener.care(apple);
		gardener.care(orange);
	}

}

interface Fruit {
	public void plant();

	public void harvest();
}

class Apple implements Fruit {
	public void plant() {
		System.out.println("Plant apple");
	}

	public void harvest() {
		System.out.println("harvest apple");
	}
}

class Orange implements Fruit {
	public void plant() {
		System.out.println("Plant orange");
	}

	public void harvest() {
		System.out.println("harvest orange");
	}
}

class Gardener {
	public void care(Fruit f) {
		f.plant();
		f.harvest();
	}
}

class AppleGardener {
	public void care(Apple apple) {
		apple.plant();
		apple.harvest();
	}
}

class OrangeGardener {
	public void care(Orange orange) {
		orange.plant();
		orange.harvest();
	}
}