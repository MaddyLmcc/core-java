package com.lao.condtional_statements;

public class LetsHaveACoffee {
	boolean isCupEmpty=false;
	
	//boolean default value is false

	public static void main(String[] args) {
		LetsHaveACoffee coffee = new LetsHaveACoffee();
		
		if(coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		}
		else {
			System.out.println("Drink the coffee");
		}

	}

}
