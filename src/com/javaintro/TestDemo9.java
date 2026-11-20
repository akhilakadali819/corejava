package com.javaintro;

public class TestDemo9 {
	String Name;
	int Rollno;
	static int batchno;
	int mobile;
	static String collegeName;
	static TestDemo9 t = new TestDemo9();
	static void method1() {
		t.Name="Akhila";
		t.Rollno=12;
		batchno=81;
		t.mobile=456;
		collegeName="SRKR";
	}
	void display() {
		method1();
		System.out.println(Name);
		System.out.println(Rollno);
		System.out.println(batchno);
		System.out.println(mobile);
		System.out.println(collegeName);
	}
	

	public static void main(String[] args) {
		t.display();

	}

}
