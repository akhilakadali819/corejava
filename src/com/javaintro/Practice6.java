package com.javaintro;

public class Practice6 {
	long AccountNumber;
	String HolderName;
	long MobileNumber;
	double Balance;
	String Branch;
	void setDetails(long accountnumber,String holdername,long number,double balance,String branch) {
		AccountNumber=accountnumber;
		HolderName=holdername;
		MobileNumber=number;
		Balance=balance;
		Branch=branch;
	}
	void display() {
	System.out.println("AccountNumber : " + AccountNumber);
	System.out.println("HolderName : " + HolderName);
	System.out.println("MobileNumber : " + MobileNumber);
	System.out.println("Balance : " + Balance);
	System.out.println("Branch : " +  Branch);
	System.out.println("----------------------------");
	
	}

	public static void main(String[] args) {
		Practice6 a = new Practice6();
		Practice6 b = new Practice6();
		Practice6 c = new Practice6();
		Practice6 d = new Practice6();
		a.setDetails(12234567893445L,"Akhila",7893456234L,90000,"hyderabad");
		b.setDetails(45522378933789L,"Bhanu",9893456278L,50000,"benglore");
		c.setDetails(56734567893367L,"karthik",6793456290L,20000,"chennai");
		d.setDetails(34534567893678L,"Anu",4593456678L,10000,"mumbai");
		a.display();
		b.display();
		c.display();
		d.display();
	}
}
