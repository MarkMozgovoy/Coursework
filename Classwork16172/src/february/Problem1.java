package february;

import java.util.Arrays;

//Mark Mozgovoy 2/6/17

public class Problem1 {
	
	public static void main(String[] args){
		int[] array = {2, 4, 6, 8, 2, 5, 1, 34, 0};
		int x = 9;
		//System.out.println("Original Array: " + Arrays.toString(array));
		System.out.println("Index of value " + x + " is: " + linearSearch(array, x));
		Arrays.sort(array);
		x = 34;
		//System.out.println("Sorted Array: " + Arrays.toString(array));
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;
		System.out.println("Index of value " + x + " (using Binary Search): " + binarySearchRecursive(array, x, 0, array.length - 1));
		elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("Time taken for operation: " + elapsedTime + " ms");
	}
	
	public static int linearSearch(int[] array, int val){
		for(int i = 0; i < array.length; i++){
			if(array[i] == val){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int val){
		int l = 0;
		int r = array.length - 1;
		int m = 0;
		while(l <= r){
			m = (r+l)/2;
			if(val == array[m]){
				return m;
			}
			if(val < array[m]){
				r = m - 1;
			}
			if(val > array[m]){
				l = m + 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] array, int val, int l, int r){
		
		int m = (r+l)/2;
		if(l > r){
			return -1;
		}
		if(val == array[m]){
			return m;
		}
		else if(val < array[m]){
			return binarySearchRecursive(array, val, l, m - 1);
		}
		else if(val > array[m]){
			return binarySearchRecursive(array, val, m + 1, r);
		}
		
		return -1;
	}
}
