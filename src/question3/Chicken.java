package question3;

import java.util.HashMap;

public class Chicken extends Bird {
	public static HashMap<String,String> languageTranslator = new HashMap<String, String>();
	public void setLanguageTranslator(HashMap<String, String> t){
		Chicken.languageTranslator = t;
	}
	@Override
	public void sing(){
		if(this.getGen() == gender.Female)
			System.out.println("Cluck, cluck"); //Chicken
		else
			System.out.println("Cock-a-doodle-doo"); // Rooster
	}	
}

