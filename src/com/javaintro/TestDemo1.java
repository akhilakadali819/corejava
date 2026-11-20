package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(" Welcome to TestDemo1 Started");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("com.javaintro.Welcome");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Welcome to TestDemo1 ended");
		

	}

}
