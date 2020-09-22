package question4;

import java.util.HashMap;

import question3.Chicken;

public class ParrotLiving extends Parrot {
	public static HashMap<String,String> languageTranslator = new HashMap<String, String>();
	public void setLanguageTranslator(HashMap<String, String> t){
		Chicken.languageTranslator = t;
}
	@Override
	public void sing(){
		if(this.getAnimal() == Animal.CAT)
			System.out.println("Meow, meow"); //Cat
		else if (this.getAnimal() == Animal.DOG)
			System.out.println("Woof, woof"); // Dog
		else if (this.getAnimal()== Animal.ROOSTER)
			System.out.println("Cock-a-doodle-doo");
		else if (this.getAnimal()== Animal.DUCK)
			System.out.println("Quack, quack");
		else 
			System.out.println("Ring, ring");
		
			
	}	
}
