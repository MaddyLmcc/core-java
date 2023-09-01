package com.lao.polymorphism;

public class Son extends Parents {
	
	@Override
	public void marriage() {
		System.out.println("My marriage i my rules");
		
	}

	public static void main(String[] args) {
		Parents parents = new Son();
		parents.properties();
		parents.marriage();

	}

}
