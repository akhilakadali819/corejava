package com.javaintro;

public class TestDemo7 {
	static void demo1() {
		System.out.println("static block1");
		TestDemo7 t = new TestDemo7();
		demo2();
		t.dog();
		t.cat();
	}
	static void demo2() {
		System.out.println("static block2");
		
		
	}
	void dog() {
		//TestDemo7 t = new TestDemo7();
		System.out.println("Instance block1");
	}
	void cat() {
		System.out.println("Instance block2");
	}

	public static void main(String[] args) {
		
		demo1();

	}

}
