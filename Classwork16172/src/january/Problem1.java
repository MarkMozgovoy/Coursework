package january;

//Mark Mozgovoy 1/19/17

public class Problem1 {
	
	//adds 2 numbers and returns result
	public static int add(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
	
	//prints even numbers in ascending order between (inclusive) 2 numbers
	public static void printEven(int num1, int num2){
		if(num1 <= num2){
			for(int i = num1; i <= num2; i++){
				if(i % 2 == 0){
					System.out.println(i);
				}
			}
		}
		else{
			for(int i = num2; i <= num1; i++){
				if(i % 2 == 0){
					System.out.println(i);
				}
			}
		}
	}
	
	public static void main(String[] args){
		System.out.println(add(1, 2));
		printEven(1, 100);
	}
}
