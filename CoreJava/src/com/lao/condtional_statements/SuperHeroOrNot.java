package com.lao.condtional_statements;

public class SuperHeroOrNot {
	String hero = "Captain America";
	
	public void heroOrNot() {
		switch (hero) {
		case "Iron man":
			System.out.println("Iron man is a super hero");
			break;
		case "Super man":
			System.out.println("Super man is a super hero");
			break;
		case "Bat man":
			System.out.println("Bat man is a super hero");
			break;
		default:
			System.out.println(hero + " Sorry I don't know about this person");
		}
	}

	public static void main(String[] args) {
		SuperHeroOrNot heroOrNot = new SuperHeroOrNot();
		heroOrNot.heroOrNot();

	}

}
