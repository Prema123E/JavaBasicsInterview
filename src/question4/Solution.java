package question4;

import question4.ParrotFinder.Animal;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrot p = new Parrot();
		System.out.println("This is a Parrot");
		p.sing();
		Parrot Pa = new ParrotLiving();
		Pa.setAnimal(Animal.CAT);
		System.out.println("Parrot living with cat");
		Pa.sing();
		Pa.setAnimal(Animal.DOG);
		System.out.println("Parrot living with dog");
		Pa.sing();
		Pa.setAnimal(Animal.ROOSTER);
		System.out.println("Parrot living with rooster");
		Pa.sing();
		
		//for solution 4d
		Pa.setAnimal(Animal.DUCK);
		System.out.println("Parrot living with DUCK");
		Pa.sing();
		Pa.setAnimal(Animal.PHONE);
		System.out.println("Parrot living with Phone");
		Pa.sing();
		
	}

}
