package com.javaintro;

public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		TestDemo8 t = new TestDemo8();
		t.method1();
		System.out.println("main method ended!!");
	}
	 void method1() {
		method2();
		method3();
		
		System.out.println("method1");
	}
	static void method2() {
		System.out.println("method2");
	}
	static void method3() {
		System.out.println("method3");
	}

}
