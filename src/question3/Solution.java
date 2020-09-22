package question3;

import question3.Animal.gender;

public class Solution {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		System.out.println("This is a Bird");
		bird.fly();
        Bird ros = new Rooster();
        System.out.println("This is a Rooster from Rooster class");
        ros.sing();
		Bird Chick = new Chicken();
		Chick.setGen(gender.Female);
		System.out.println("This is Chicken from Chicken class");
		Chick.sing();
		Chick.setGen(gender.Male);
		System.out.println("This is Rooster from Chicken class");
		Chick.sing();

	}

}
