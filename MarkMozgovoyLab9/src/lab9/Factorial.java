package lab9;

public class Factorial {
	
	int value;
	
	public Factorial(int i){
		this.value = i;
	}
	
	public int calculateFactorial(){
		int i = this.value;
		int result = 1;
		for(int j = i; j > 0; j--){
			result = result * j;
		}
		return(result);
	}
}