package com.lao.abstraction;

public  class BMW extends Car{
	
	public void engine() {
		System.out.println("BMW Engine");
	}

	public static void main(String[] args) {
		Car bmw = new BMW();
		bmw.engine();

	}

	@Override
	public void companyVault() {
		// TODO Auto-generated method stub
		
	}
		
	

}
