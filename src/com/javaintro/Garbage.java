package com.javaintro;

public class Garbage {

	public static void main(String[] args) {
		System.out.println("main method started");
		Garbage e1 = new Garbage();
		Garbage e2 = new Garbage();
		Garbage e3 = new Garbage();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		e3=null;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
