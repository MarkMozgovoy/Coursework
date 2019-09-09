package lab2;

import java.util.Arrays;

//Mark Mozgovoy 2/8/17

public class RecursiveArrayMax {
	
	public static void main(String[] args){
		
		//declare sample array
		int[] array = {5, 4, 3, 2, 1, 10, 2, 3, 4, 5};
		
		//print the original array and its maximum value
		System.out.println("Original Array: " + Arrays.toString(array));
		System.out.println("The maximum of all values in the array: " + maxArray(array, 0));
	}
	
	public static int maxArray(int[] array, int i){
		//return last element to stop recursion
		if(i == array.length - 1){
			return array[array.length-1];
		}
		
		//return the max value of current element and the next one
		return Math.max(array[i], maxArray(array, i+1));
	}
}
