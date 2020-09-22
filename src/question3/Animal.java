package question3;

public abstract class Animal {
	public enum gender {Male, Female};
	public gender gen ;
	public gender getGen() {
		return gen;
	}
	public void setGen(gender gen) {
		this.gen = gen;
	}
	
}
