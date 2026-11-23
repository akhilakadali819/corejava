package com.javaintro;

public class BankAccount {
	static int count=100;
	int AccountNumber;	
	String HolderName;
	long MobileNumber;
	String IFSCcode;
	double Balance;
	
	void setDetails(String holdername,long mobilenumber,String Ifsccode,double balance) {
	count++;
	AccountNumber=count;
		HolderName=holdername;
		 MobileNumber=mobilenumber;
		 IFSCcode=Ifsccode;
		 Balance=balance;
	}
	void display() {
		System.out.println("AccountNumber : " +AccountNumber);
		System.out.println("HolderName : " + HolderName);
		System.out.println("MobileNumber : " + MobileNumber);
		System.out.println(" IFSCcode: " +  IFSCcode);
		System.out.println(" Balance : " +  Balance);
		System.out.println("----------------------------");
		
		
	}
	public static void main(String[] args) {
		
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		a.setDetails("Akhila", 5678934523L,"tyuerou", 567890);
		b.setDetails("Kavayya", 67778934234L,"ifrdehn", 890564);
		a.display();
		b.display();

	}

}
