package inClassQuiz;

public class DataSetTester {
	public static void main(String[] args){
		Die die = new Die();
		DataSet set = new DataSet();
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		set.add(die.castDie());
		System.out.println("Cast " + die.getCastValue());
		System.out.println("Max: " + set.getMaximum());
		System.out.println("Min: " + set.getMinimum());
		System.out.println("Average: " + set.getAverage());
	}
}
