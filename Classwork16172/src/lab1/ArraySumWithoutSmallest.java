package lab1;

import java.util.Arrays;

//Mark Mozgovoy 1/26/17

public class ArraySumWithoutSmallest {
	public static void main(String[] args){
		
		//sample array
		int[] array = {2, 5, 76, 90, -15};
		
		//print the array and print the sum without the smallest element.
		System.out.println("The original array is: ");
		System.out.println(Arrays.toString(array));
		System.out.println("The sum without the smallest element is: " + sumWithoutSmallest(array));
	}

	public static int sumWithoutSmallest(int[] array) {
		//declare first array element as smallest.
		int smallest = array[0];
		
		//sum up every element, change smallest element if a compared element is smaller.
		int sum = 0;
		for(int i = 0; i < array.length; i ++){
			if(array[i] < smallest){
				smallest = array[i];
			}
			sum += array[i];
		}
		
		//return sum without the smallest element.
		return (sum - smallest);
	}
}
