package com.javaintro;

public class Practice3 {
	int EmployeeId;
	String EmployeeName;
	double EmployeeSalary;
	void setDetails(int id,String name,double salary) {
		EmployeeId=id;
		EmployeeName=name;
		EmployeeSalary=salary;
	}
	double calculateAnnualSalary() {
		return EmployeeSalary*12;	
	}
	void display() {
		System.out.println("EmployeeId : " +EmployeeId);
		System.out.println("EmployeeName : " +EmployeeName);
		System.out.println("EmployeeSalary : " +EmployeeSalary);
		System.out.println("AnnualSalary : " + calculateAnnualSalary());
		
		System.out.println("---------------------------");
	}

	public static void main(String[] args) {
		Practice3 a = new Practice3();
		Practice3 b = new Practice3();
		a.setDetails(123,"Akhila",50000);
		b.setDetails(124,"kavaya",30000);
		a.display();
		b.display();
		
	}

}
