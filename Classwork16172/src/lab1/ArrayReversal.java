package lab1;

import java.util.Arrays;

//Mark Mozgovoy 1/26/17

public class ArrayReversal {
	public static void main(String[] args){
		
		//sample array
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//print original array, reverse it, and print reversed array.
		System.out.println("The original array is: ");
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println("The reverse array is: ");
		System.out.println(Arrays.toString(array));
	}
	
	public static void reverse(int[] array){
		
		//declare temporary variable used for storing array element.
		int temp = 0;
		
		//switch the array elements at indices i and length - i - 1. This reverses the array.
		for(int i = 0; i < array.length/2; i++){
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
	}
}
