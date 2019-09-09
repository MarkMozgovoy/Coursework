package assignment3;

//Mark Mozgovoy 4/30/17

public class TwoDimensionalArrayExercise {
	
	public static void main(String[] args){
		
		//create a sample array
		int[][] array = new int[10][10];
		
		System.out.println("First, we create the array: \n");
		
		//Fill the array with 0's for display purposes and print it
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = 0;
			}
		}
		printArray(array);
		
		//fill edges with -1s and print the updated array
		System.out.println("\nThen we fill the edges with -1's: \n");
		fillEdges(array);
	}
	
	//ANSWER TO QUESTION 1 OF ASSIGNMENT 3
	//this converts an array's edges into -1s
	public static void fillEdges(int[][] array){
		for(int i = 0; i < array.length; i++){
			array[0][i] = -1;
			array[array.length-1][i] = -1;
			array[i][0] = -1;
			array[i][array.length-1] = -1;
		}
		printArray(array);
	}
	
	//prints a 2D array
	public static void printArray(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j] != -1){
					System.out.print("  " + array[i][j]);
				}
				else{
					System.out.print(" " + array[i][j]);
				}
				
			}
			System.out.println();
		}
	}
}
