package com.javaintro;

public class TestDemo2 {
static void method5() {
	System.out.println("method5 called");
}
static void method2() {
	TestDemo2 t = new TestDemo2();
	t.method3();
	System.out.println("method2 called");
}
static void method1() {
	method2();
	System.out.println("method1 called");
}
	public static void main(String[] args) {
	System.out.println(" main method started");	
    method1();
    System.out.println("main method ended");
	}void method3() {
		method4();
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
		method5();
	}

}
