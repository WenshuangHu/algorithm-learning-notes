package algorithm.sort;

/**
 * Bubble algorithm.sort, also referred to as sinking algorithm.sort, is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 * The selection algorithm.sort is a combination of searching and sorting. During each pass, the unsorted element with the smallest (or largest) value
 * is moved to its proper position in the array. The number of times the algorithm.sort passes through the array is one less than the number of items
 * in the array. In the selection algorithm.sort, the inner loop finds the next smallest (or largest) value and the outer loop places that value into
 * its proper location.
 *
 */
public class Bubblesort {
	private static int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	public static void main(String[] args) {
		bubbleSort(input);
		
	}

	private static void bubbleSort(int[] input) {
		int lastIndex = input.length - 1;
		for (int i = 0; i < input.length; i++ ) {
			for (int j = 0; j < lastIndex; j++) {
				if (input[j] > input[j + 1]) {
					int tmp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = tmp;
				}
			}
			output(input);
			lastIndex--;
			System.out.println();
		}
	}

	private static void output(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}













	
	
	private static int[] sort1() {
		for (int i = input.length - 1; i > 0; i--) 
			for (int j = 0; j < i; j ++) {
				if (input[j] > input[j + 1]) {
					int tmp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = tmp;
				}
			}
		
		return input;
	}
	
	private static int[] sort() {
		for (int i = 0; i < input.length; i++) {
			int index = i;
			for (int j = i; j < input.length; j ++) {
				if (input[j] < input[index]) {
					index = j;
				}
			}
			int tmp = input[i];
			input[i] = input[index];
			input[index] = tmp;
		}
		return input;
	}
	
	private static void printOuput(int[] output) {
		for (int o : output) {
			System.out.println(o);
		}
	}

}
