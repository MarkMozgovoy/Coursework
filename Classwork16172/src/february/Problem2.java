package february;

//Mark Mozgovoy 2/16/17

public class Problem2 {
	public static void main(String[] args){
		
	}
	
	public static void mergeSort(int[] array, int left, int right){
		if(left < right){
			int middle = (right - left) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			//merge(array, left, middle, right);
		}
	}
	
	public static void merge(){
		return;
	}
}