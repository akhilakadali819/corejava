package com.javaintro;

public class TestDemo5 {
	static void demo1() {
		System.out.println("static block1");
	}
	static void demo2() {
		System.out.println("static block2");

	}
	 void dog() {
		
		System.out.println("instance block1");
	}
	 void cat() {
	
		 System.out.println("instance block2");
	 }
	

	public static void main(String[] args) {
		TestDemo5 t = new TestDemo5();
		demo1();
	    demo1();
	    t.dog();
	t.cat();
	
	

	}

}
