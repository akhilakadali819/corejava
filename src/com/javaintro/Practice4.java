package com.javaintro;

public class Practice4 {
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		
		new Practice4();
		new Practice4();
		new Practice4();
		new Practice4();
		System.out.println(count);
	}

}
