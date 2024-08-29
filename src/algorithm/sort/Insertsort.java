package algorithm.sort;

/**
 * Insertion algorithm.sort is a simple sorting algorithm, it builds the final sorted array one item at a time.
 * It is much less efficient on large lists than other algorithm.sort algorithms.
	Advantages of Insertion Sort: 
	1) It is very simple.
	2) It is very efficient for small data sets.
	3) It is stable; i.e., it does not change the relative order of elements with equal keys.
	4) In-place; i.e., only requires a constant amount O(1) of additional memory space.	
	Insertion algorithm.sort iterates through the list by consuming one input element at each repetition, and growing a sorted output list.
	On a repetition, insertion algorithm.sort removes one element from the input data, finds the location it belongs within the sorted list,
	and inserts it there. It repeats until no input elements remain.
 *
 */
public class Insertsort {
	private static int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	public static void main(String[] args) {
		//Insertsort.printOuput(algorithm.sort());
		insertionSort(input);
	}

	public static void insertionSort(int[] input) {
		for (int i = 0; i < input.length - 1; i ++) {
			int j = i + 1;
			while (j > 0) {
				if (input[j - 1] > input[j]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
					j--;
				} else {
					break;
				}
			}
			printOuput(input);
			System.out.println();
		}
	}











	 public static int[] doInsertionSort(int[] input){
         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	
	private static void printOuput(int[] output) {
		for (int o : output) {
			System.out.print(o + " ");
		}
	}

}
