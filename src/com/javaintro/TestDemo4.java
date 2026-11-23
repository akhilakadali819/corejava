package com.javaintro;

public class TestDemo4 {
	static TestDemo4 t = new TestDemo4();
	static {
		System.out.println("static block1");
	}
	{
		System.out.println("instance block1");
	}
	void main(String[] args) {
	
		System.out.println("main method started");
		System.out.println("main method ended");
	}

}
