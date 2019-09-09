package january;

//Mark Mozgovoy 1/23/17

public class Problem2 {
	
	public static void main(String[] args){
		int[] array = {2, 6, 8, 4, 3};
		int add = 0;
		for(int i = 0; i < array.length; i++){
			add += array[i];
			System.out.println(array[i]);
		}
		System.out.println(add);
	}
}
