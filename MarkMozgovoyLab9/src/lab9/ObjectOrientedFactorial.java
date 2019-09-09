package lab9;

public class ObjectOrientedFactorial {
	public static void main(String[] args){
		Factorial i = new Factorial(10);
		System.out.println("10! is " + i.calculateFactorial());
	}
}
