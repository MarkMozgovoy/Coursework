package january;

//Mark Mozgovoy 1/30/17

public class Problem3 {
	public static void main(String[] args){
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
	}

	public static int factorial(int i) {
		// TODO Auto-generated method stub
		if(i == 1){
			return 1;
		}
		return i * factorial(i - 1);
	}
}
