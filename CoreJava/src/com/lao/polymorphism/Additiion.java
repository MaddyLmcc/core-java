package com.lao.polymorphism;

public class Additiion {
	
	int add(int n1 , int n2) {
		return n1+n2;
	}
	int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}

	public static void main(String[] args) {
		Additiion obj = new Additiion();
		System.out.println("Sum of two num: " + obj.add(52,56));
		System.out.println("Sum of three num: " + obj.add(58,104,123));
	}

}
