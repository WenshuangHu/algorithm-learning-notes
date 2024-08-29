package algorithm.sort;

/**
 * Quicksort or partition-exchange algorithm.sort, is a fast sorting algorithm, which is using divide and conquer algorithm.
 * Quicksort first divides a large list into two smaller sub-lists: the low elements and the high elements. 
 * Quicksort can then recursively algorithm.sort the sub-lists.

	Steps to implement Quick algorithm.sort:

	1) Choose an element, called pivot, from the list. Generally pivot can be the middle index element.
	2) Reorder the list so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.
	3) Recursively apply the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with greater values.
 *
 */
public class Quicksort {
	private static int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
	public static void main(String[] args) {
		quickSort(input, 0, input.length - 1);
		//Quicksort.printOuput(input);
		
	}

	public static void quickSort(int low, int high) {
		int l = low;
		int h = high;
		int midValue = input[(l + h)/2];
		while (l <= h) {
			while (input[l] < midValue) {
				l++;
			}
			while (input[h] > midValue) {
				h--;
			}
			if (l <= h) {
				change(l, h);
				l++;
				h--;
			}
		}
		if (low < h ) {
			quickSort(low, h);
		}
		if (high > l) {
			quickSort(l, high);
		}
	}


	private static void quickSort(int[] inputs, int start, int end) {
		int low = start;
		int high = end;
		int midValue = inputs[(start + end) / 2];
		System.out.println("middle value is: " + midValue);
		while (low <= high) {
			while (inputs[low] < midValue) {
				low++;
			}
			while (inputs[high] > midValue) {
				high--;
			}
			if (low <= high) {
				int tmp = inputs[high];
				inputs[high] = inputs[low];
				inputs[low] = tmp;
				low++;
				high--;
			}
			printOuput(inputs);
		}

		if (start < high) {
			quickSort(inputs, start, high);
		}
		if (low < end) {
			quickSort(inputs, low, end);
		}

	}
	
	private static void change(int start, int end) {
		int tmp = input[start];
		input[start] = input[end];
		input[end] = tmp;
	}

	
	private static void exchangeNumbers(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
	
	private static void printOuput(int[] output) {
		for (int o : output) {
			System.out.print(o + " ");
		}

		System.out.println();
	}

}
