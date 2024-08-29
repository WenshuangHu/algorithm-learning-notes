package algorithm.search.binarysearch;

public class IterativeImplementation {

	public static void main(String[] args) {
		int [] datas = new int[]{1, 2, 3, 4, 5, 6, 7};
//		System.out.println(bsearch(datas, 3));
//		System.out.println(bsearch1(datas, 3));
//		System.out.println(bsearch2(datas, 3, 0, datas.length - 1));
		System.out.println(search(datas, 7));
	}

	private static int search(int[] input, int target) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;
			if (input[middle] == target) {
				return middle;
			} else if (input[middle] < target) {
				low = ++middle;
			} else {
				high = --middle;
			}
		}
		return Integer.MAX_VALUE;
	}











	
	
	private static int bsearch1(int[] datas, int obj) {
		int start = 0;
		int end = datas.length -1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if (datas[mid] < obj) 
				start = mid + 1;
			else if (datas[mid] > obj) 
				end = mid -1;
			else
				return mid;
		}
		
		return -1;
	}
	
	private static int bsearch2(int[] datas, int obj, int start, int end) {
		if (start < end) {
			int midValue = (start + end) / 2;
			if (datas[midValue] < obj)
				return bsearch2(datas, obj, midValue + 1, end);
			else if (datas[midValue] > obj)
				return bsearch2(datas, obj, start, midValue);
			else
				return midValue;
		}	
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int bsearch(int[] datas, int s) {
		if (datas == null || datas.length == 0) 
			return -1;
		int l = 0;
		int u = datas.length - 1;
		while (l <= u) {
			int m = (l + u) / 2;
			if (s < datas[m]) {
				u = m - 1;
			} else if (s == datas[m]) {
				return m;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}

}
