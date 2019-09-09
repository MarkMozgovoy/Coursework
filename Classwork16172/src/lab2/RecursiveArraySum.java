package lab2;

import java.util.Arrays;

//Mark Mozgovoy 2/8/17

public class RecursiveArraySum {
	
	public static void main(String[] args){
		//declare sample array
		int[] array = {5, 4, 3, 2, 1, 1, 2, 3, 4, 5};
		
		//print original array and the sum of its values
		System.out.println("Original Array: " + Arrays.toString(array));
		System.out.println("The sum of all values in the array: " + sumArray(array, 0));
	}
	
	public static int sumArray(int[] array, int i){
		//return last element to stop recursion
		if(i == array.length-1){
			return array[array.length-1];
		}
		
		//sum up the current element with the next one
		return array[i] + sumArray(array, i + 1);
	}
}
