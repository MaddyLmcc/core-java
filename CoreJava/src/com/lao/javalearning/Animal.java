package com.lao.javalearning;

public class Animal {
	String animal_name;
	String animal_type;
	
	//Parameterized Constructor
	
	public Animal(String name, String type) {
		animal_name = name;
		animal_type = type;
	}
	
	public void sayAboutAnimal() {
		System.out.println("Animal name is " + animal_name + " and type is " + animal_type);
	}

	public static void main(String[] args) {
		Animal animal = new Animal("Lion", "Omniverse");
		animal.sayAboutAnimal();

	}

}
