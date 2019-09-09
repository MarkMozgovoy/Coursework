package lab1;


//Mark Mozgovoy 1/26/17

import java.util.Arrays;

public class ArrayManipulator {
	
	public static void main(String[] args){
		
		//assemble and print original array of 10 random ints from 0 to 9.
		System.out.println("The original array is: ");
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++){
			array[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(array));
		
		//print elements at even indices, even elements, reverse of the array, and the first and last elements.
		even(array);
		evenElements(array);
		reverse(array);
		firstLast(array);
	}
	
	public static void even(int[] array){
		
		//declare output string.
		String output = "";
		
		//only add elements to output string if the index is even.
		for(int i = 0; i < array.length; i++){
			if(i % 2 == 0){
				output += array[i] + " ";
			}
		}
		
		//print results
		System.out.println("The elements at even indices are: " + output);
	}
	
	public static void evenElements(int[] array){
		
		//declare output string.
		String output = "";
		
		//only add elements to output string if the element is even.
		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				output += array[i] + " ";
			}
		}
		System.out.println("The even elements are: " + output);
	}
	
	public static void reverse(int[] array){
		
		//declare output string.
		String output = "";
		
		//add elements to the output string in reverse order.
		for(int i = array.length - 1; i > -1; i--){
				output += array[i] + " ";
		}
		System.out.println("The elements in reverse order are: " + output);
	}
	
	public static void firstLast(int[] array){
		
		//just print last and first element of given array.
		System.out.println("The first element in the array is: " + array[0]);
		System.out.println("The last element in the array is: " + array[array.length-1]);
	}
}
