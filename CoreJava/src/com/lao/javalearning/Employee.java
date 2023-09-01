package com.lao.javalearning;

public class Employee {
	int employeeid;
	String employeename;
	
	//No Argument Constructor
	
	public Employee() {
		employeeid = 5;
		employeename = "Ani";
		System.out.println("Employee object i created");
	}

	public static void main(String[] args) {
		Employee employee = new Employee();

	}

}
