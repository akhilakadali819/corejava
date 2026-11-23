package com.javaintro;

public class Practise1 {
	int studentId;
	String Name;
	String Branch;
	int studentmarks;
	static Practise1 a = new Practise1(); 
	static Practise1 b = new Practise1();
	static Practise1 c = new Practise1();
	void display(){
		
		a.studentId=11;
		a.Name="Akhila";
		a.Branch="ECE";
		a.studentmarks=100;
		 
		b.studentId=12;
		b.Name="Bhanu";
		b.Branch="CSE";
		b.studentmarks=90;
		
		c.studentId=13;
		c.Name="Bhavaya";
		c.Branch="EEE";
		c.studentmarks=89;
	}
	void display1() {
		display();
		System.out.println("studentID : " + a.studentId);
		System.out.println("studentName : " + a.Name);
		System.out.println("studentBranch : " + a.Branch);
		System.out.println("studentMarks : " + a.studentmarks);
		System.out.println("-----------------------------");
		
		System.out.println("studentID : " + b.studentId);
		System.out.println("studentName : " + b.Name);
		System.out.println("studentBranch : " + b.Branch);
		System.out.println("studentMarks : " + b.studentmarks);
		System.out.println("-----------------------------");
		
		System.out.println("studentID : " + c.studentId);
		System.out.println("studentName : " + c.Name);
		System.out.println("studentBranch : " + c.Branch);
		System.out.println("studentMarks : " + c.studentmarks);
		System.out.println("-----------------------------");
		
	}

	public static void main(String[] args) {
		a.display1();
		
	}

}
