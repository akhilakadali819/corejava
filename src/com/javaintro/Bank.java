package com.javaintro;

public class Bank {
	int accountnumber;
	String HolderName;
	long MobileNumber;
	double balance;
	String branch;
	static Bank a = new Bank();
	static Bank b = new Bank();
	static Bank c = new Bank();
	static Bank d = new Bank();
	
	 static void method1(){
		a.accountnumber=123;
		a.HolderName="akhi";
		a.MobileNumber=7396592485L;
		a.balance=90000.897;
		a.branch="Hyderabad";
		
		b.accountnumber=124;
		b.HolderName="akash";
		b.MobileNumber=5924858781L;
		b.balance=50000.00;
		b.branch="benglore";
		
		c.accountnumber=125;
		c.HolderName="karthik";
		c.MobileNumber=2345687815L;
		c.balance=60000.00;
		c.branch="chennai";
		
		d.accountnumber=126;
		d.HolderName="Ammulaya";
		d.MobileNumber=5895679815L;
		d.balance=80000.00;
		d.branch="mumbai";
		
	}
		  static void method2() {
			  method1();
			  System.out.println("accountnumber : " + a.accountnumber);
				System.out.println("HolderName : " + a.HolderName);
				System.out.println("MobileNumber : " + a.MobileNumber);
				System.out.println("Balance : " + a.balance);
				System.out.println("branch : " + a.branch);
				System.out.println("-------------------");
				
			System.out.println("accountnumber : " + b.accountnumber);
			System.out.println("HolderName : " + b.HolderName);
			System.out.println("MobileNumber : " + b.MobileNumber);
			System.out.println("Balance : " + b.balance);
			System.out.println("branch : " + b.branch);
			System.out.println("-------------------");
			
			System.out.println("accountnumber : " + c.accountnumber);
			System.out.println("HolderName : " + c.HolderName);
			System.out.println("MobileNumber : " + c.MobileNumber);
			System.out.println("Balance : " + c.balance);
			System.out.println("branch : " + c.branch);
			System.out.println("-------------------");
			
			System.out.println("accountnumber : " + d.accountnumber);
			System.out.println("HolderName : " + d.HolderName);
			System.out.println("MobileNumber : " + d.MobileNumber);
			System.out.println("Balance : " + d.balance);
			System.out.println("branch : " + d.branch);
			System.out.println("-------------------");
		}
	
	public static void main(String[] args) {
	method2();
	}

}
