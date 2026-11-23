package com.javaintro;

public class Practice2 {
	int studentId;
	String studentName;
	String studentbranch;
	int studentMarks;
	void setDetails(int id,String name, String branch, int marks) {
		studentId=id;
		studentName=name;
		studentbranch=branch;
		studentMarks=marks;
	}
		void display() {
			System.out.println("studentId : " + studentId);
			System.out.println("studentName : " + studentName);
			System.out.println("studentbranch : " + studentbranch);
			System.out.println("studentMarks : " + studentMarks);
			System.out.println("-------------------------------");
			
			}
	public static void main(String[] args) {
		 Practice2 a = new Practice2();
		 Practice2 b = new Practice2();
		 Practice2 c = new Practice2();
		 a.setDetails(11, "Akhila", "ECE", 100);
		 b.setDetails(12, "Bhanu", "CSE", 90);
		 c.setDetails(13, "Bhavaya", "EEE", 80);
		 a.display();
		 b.display();
		 c.display();
	}
		 

	}


