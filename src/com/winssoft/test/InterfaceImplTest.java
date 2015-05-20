package com.winssoft.test;

public class InterfaceImplTest {
	public static void main(String[] args) {
		System.out.println("Aloha");
	}
}

interface I {
	public void m();

	public void m2();
}

class T implements I {

	@Override
	public void m() {

	}

	@Override
	public void m2() {

	}

}