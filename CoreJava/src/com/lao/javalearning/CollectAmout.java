package com.lao.javalearning;

public class CollectAmout {
	Integer collectedAmount = 1000;
	
	public Integer collectAmountAndGiveItToMe() {
		System.out.println("Daddy have collected Rupees " + collectedAmount + " sent it to you");
		return collectedAmount;
	}

	public static void main(String[] args) {
		//Return Type
        CollectAmout mySon = new CollectAmout();
        Integer amount = mySon.collectAmountAndGiveItToMe();
        System.out.println("Got the amount son " + amount);
	}

}
