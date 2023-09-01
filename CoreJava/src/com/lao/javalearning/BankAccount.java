package com.lao.javalearning;

public class BankAccount {
	
	Long accountnumber = 123456789l;
	String holdername = "Madhan";
	Integer accountbalance = 1200;
	
	public void getAccountnmber() {
		System.out.println("Account Number is " + accountnumber);
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.getAccountnmber();

	}

}
