package com.javaintro;

public class Practice5 {
	static String collegeName;
	static {
		System.out.println("static block is called");
	}
	{
		System.out.println("Instance block1 is called");
	}
	{
		System.out.println("Instance block2 is called");
	}
	Practice5() {
		System.out.println("constructor is called");
	}
	static void method1(){
		
		System.out.println("static method is called");
	}
	void method2() {
		System.out.println(" Instance method is called");
	}
	public static void main(String[] args) {
		method1();
		Practice5 a = new Practice5();
		Practice5 b = new Practice5();
		a.method2();
		b.method2();

	}

}
