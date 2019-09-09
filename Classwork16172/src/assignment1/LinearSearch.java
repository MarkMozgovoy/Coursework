package assignment1;

//Mark Mozgovoy 2/23/17

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args){
		int[] array = {-4, -2, 0, 3, 9, 12, 15, 18, 20};
		System.out.println("The array is: " + Arrays.toString(array));
		System.out.println("Search for 9 iteratively: ");
		iterativeLinearSearch(array, 9);
		System.out.println("Search for -4 recursively: ");
		recursiveLinearSearch(array, -4, 0);
		System.out.println("Search for 8 iteratively: ");
		iterativeLinearSearch(array, 8);
		System.out.println("Search for 2 recursively: ");
		recursiveLinearSearch(array, 2, 0);
	}
	
	public static void iterativeLinearSearch(int[] array, int num){
		for(int i = 0; i < array.length; i++){
			if(array[i] == num){
				System.out.println("Integer " + num + " was found at index " + i + ".");
				return;
			}
		}
		System.out.println("Integer " + num + " was not found in the array.");
	}
	
	public static void recursiveLinearSearch(int[] array, int num, int index){
		if(index == array.length){
			System.out.println("Integer " + num + " was not found in the array.");
			return;
		}
		
		if(array[index] == num){
			System.out.println("Integer " + num + " was found at index " + index + ".");
			return;
		}
		
		recursiveLinearSearch(array, num, index+1);
	}
}
