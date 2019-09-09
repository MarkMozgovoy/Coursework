package assignment1;

//Mark Mozgovoy 2/23/17

import java.util.Arrays;


public class TimeQuestion {
	public static void main(String[] args){
		int[] array1 = generateArray(10);
		int[] array2 = generateArray(100);
		int[] array3 = generateArray(1000);
		int[] array4 = generateArray(10000);
		int[] array5 = generateArray(100000);
		//System.out.println(Arrays.toString(array3));
		
		long start = System.nanoTime();
		iterativeBinarySearch(array1, 999);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("Iterative binary search on array1 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeBinarySearch(array2, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative binary search on array2 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeBinarySearch(array3, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative binary search on array3 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeBinarySearch(array4, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative binary search on array4 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeBinarySearch(array5, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative binary search on array5 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveBinarySearch(array1, 999, 0, array1.length - 1);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive binary search on array1 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveBinarySearch(array2, 999, 0, array2.length - 1);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive binary search on array2 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveBinarySearch(array3, 999, 0, array3.length - 1);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive binary search on array3 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveBinarySearch(array4, 999, 0, array4.length - 1);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive binary search on array4 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveBinarySearch(array5, 999, 0, array5.length - 1);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive binary search on array5 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeLinearSearch(array1, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative linear search on array1 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeLinearSearch(array2, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative linear search on array2 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeLinearSearch(array3, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative linear search on array3 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeLinearSearch(array4, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative linear search on array4 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		iterativeLinearSearch(array5, 999);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Iterative linear search on array5 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveLinearSearch(array1, 999, 0);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive linear search on array1 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveLinearSearch(array2, 999, 0);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive linear search on array2 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveLinearSearch(array3, 999, 0);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive linear search on array3 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveLinearSearch(array4, 999, 0);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive linear search on array4 took " + time + " nanoseconds");
		
		start = System.nanoTime();
		recursiveLinearSearch(array5, 999, 0);
		stop = System.nanoTime();
		time = stop - start;
		System.out.println("Recursive linear search on array5 took " + time + " nanoseconds");
	}
	

	public static int[] generateArray(int i) {
		int[] rand = new int[i];
		for(int a = 0; a < rand.length; a++){
			rand[a] = (int)(Math.random() * (i));
		}
		return rand;
	}
	
	public static void iterativeBinarySearch(int[] array, int num){
		if(!isSorted(array));
			Arrays.sort(array);
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
		if(!isSorted(array));
			Arrays.sort(array);
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
		
		if(index > array.length - 1){
			System.out.println("Integer " + num + " was not found in the array.");
			return;
		}
		
		if(array[index] == num){
			System.out.println("Integer " + num + " was found at index " + index + ".");
			return;
		}
		
		recursiveLinearSearch(array, num, index+1);
	}
	
	public static boolean isSorted(int[] array){
		for(int i = 0; i < array.length-1; i++){
			if(array[i+1] < array[i]){
				return false;
			}
		}
		return true;
	}
}