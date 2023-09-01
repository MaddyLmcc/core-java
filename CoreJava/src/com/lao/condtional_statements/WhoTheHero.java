package com.lao.condtional_statements;

public class WhoTheHero {
	String myheroname="Thor";
	
	public void superHeroGuesser() {
		if(myheroname.equals("Iron man")) {
			System.out.println("You thought about Iron man");
		}
		else if(myheroname.equals("Super man")) {
			System.out.println("You thought about Super man");
		}
		else if(myheroname.equals("Thor")) {
			System.out.println("You thought about Thor");
		}
		else {
			System.out.println("Sorry I can't guess!!");
		}
	}

	public static void main(String[] args) {
		WhoTheHero hero = new WhoTheHero();
		hero.superHeroGuesser();

	}

}
