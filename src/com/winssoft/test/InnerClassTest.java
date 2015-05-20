package com.winssoft.test;

public class InnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}
}


class Outer {
	private int i = 100;
	class Inner {
		public void print() {
			System.out.println(i);
		}
	}
	public void display() {
		Inner inner = new Inner();
		inner.print();
	}
}