package algorithm.sort;

/**
 * Bubble algorithm.sort, also referred to as sinking algorithm.sort, is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted,
 * comparing each pair of adjacent items and swapping them if they are in the wrong order. 
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. 
 * The algorithm gets its name from the way smaller elements "bubble" to the top of the list. Because it only uses comparisons to operate on elements, 
 * it is a comparison algorithm.sort. Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.
 * 
 * Bubble algorithm.sort has worst-case and average complexity both О(n2), where n is the number of items being sorted.
 * There exist many sorting algorithms with substantially better worst-case or average complexity of O(n log n). 
 * Even other О(n2) sorting algorithms, such as insertion algorithm.sort, tend to have better performance than bubble algorithm.sort.
 * Therefore, bubble algorithm.sort is not a practical sorting algorithm when n is large.
 * Performance of bubble algorithm.sort over an already-sorted list (best-case) is O(n).
 *
 */
public class Selectionsort {
	private static int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	public static void main(String[] args) {
		//Selectionsort.printOuput(algorithm.sort());
		selectionSort(input);
	}

	private static void selectionSort(int[] input) {
		for (int i = input.length; i > 0; i--) {
			int maxIndex = 0;
			for (int j = 0; j < i; j++) {
				if (input[maxIndex] < input[j]) {
					maxIndex = j;
				}
			}
			int tmp = input[i - 1];
			input[i - 1] = input[maxIndex];
			input[maxIndex] = tmp;
			printOuput(input);
			System.out.println();
		}
	}



	private static int[] sort() {
		for (int i = input.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j ++)
				if (input[j] > input[j + 1]) {
					int tmp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = tmp;
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
