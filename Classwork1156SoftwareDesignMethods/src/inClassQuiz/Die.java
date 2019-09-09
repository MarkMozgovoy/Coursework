package inClassQuiz;

public class Die implements Measurable {
	private int castValue;
	
	public Die(){
		this.castValue = (int)(Math.random() * 6 + 1);
	}
	
	public int castDie(){
		return this.castValue = (int)(Math.random() * 6 + 1);
	}
	
	public int getCastValue(){
		return this.castValue;
	}
}
