package com.winssoft.test;

public class NMInnerTest {
	public static void main(String[] args) {
		I1 i = new I1() {
			@Override
			public void hello() {
				System.out.println("hello");
			}
		};
		i.hello();
		T1 t1 = new T1();
		t1.hello();
	}
}

interface I1 {
	public void hello();
}

class T1 implements I1 {
	@Override
	public void hello() {
		System.out.println("Aloha");
	}
}