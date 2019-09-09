package assignment1;

//Mark Mozgovoy 2/23/17

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args){
		int[] array = {-10, -8, 5, 12, 16, 54, 100, 180, 200};
		System.out.println("The array is: " + Arrays.toString(array));
		System.out.println("Search for 16 iteratively: ");
		iterativeBinarySearch(array, 16);
		System.out.println("Search for -8 recursively: ");
		recursiveBinarySearch(array, -8, 0, array.length - 1);
		System.out.println("Search for -9 iteratively: ");
		iterativeBinarySearch(array, -9);
		System.out.println("Search for 4 recursively: ");
		recursiveBinarySearch(array, 4, 0, array.length - 1);
	}
	
	public static void iterativeBinarySearch(int[] array, int num){
		int l = 0;
		int r = array.length - 1;
		int m = 0;
		while(l <= r){
			m = (r+l)/2;
			if(num == array[m]){
				System.out.println("Integer " + num + " was found at index " + m + ".");
				return;
			}
			if(num < array[m]){
				r = m - 1;
			}
			if(num > array[m]){
				l = m + 1;
			}
		}
		System.out.println("Integer " + num + " was not found in the array.");
	}
	
	public static void recursiveBinarySearch(int[] array, int num, int l, int r){
		
		int m = (r+l)/2;
		if(l > r){
			System.out.println("Integer " + num + " was not found in the array.");
			return;
		}
		if(num == array[m]){
			System.out.println("Integer " + num + " was found at index " + m + ".");
			return;
		}
		else if(num < array[m]){
			recursiveBinarySearch(array, num, l, m - 1);
		}
		else if(num > array[m]){
			recursiveBinarySearch(array, num, m + 1, r);
		}
		
	}
}