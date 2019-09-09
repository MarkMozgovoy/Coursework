package lab9;

public class ProceduralFactorial {
	public static void main(String[] args){
		int i = 10;
		int result = 1;
		for(int j = i; j > 0; j--){
			result = result * j;
		}
		System.out.println("10! is " + result);
	}
}
