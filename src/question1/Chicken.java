package question1;

public class Chicken extends Bird {
	@Override
	public void sing() {
		System.out.println("Cluck Cluck"); //2nd one
	}
	
	@Override
	public void fly() {
		System.out.println("I cannot fly"); // 2nd one
	}
}
