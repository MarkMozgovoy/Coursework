package january;

//Mark Mozgovoy 1/30/17

public class FibonacciSequence {
	public static void main(String[] args){
		for(int i = 1; i < 10; i++){
			System.out.println(FibonacciMethod(i));
		}
		
		//implement iteration if you so wish
		
	}
	
	public static int FibonacciMethod(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return FibonacciMethod(n-1) + FibonacciMethod(n-2);
	}
	
	
}
