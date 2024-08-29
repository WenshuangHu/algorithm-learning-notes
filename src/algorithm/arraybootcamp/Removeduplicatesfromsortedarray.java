package algorithm.arraybootcamp;

public class Removeduplicatesfromsortedarray {
	
	public static int removeDuplicates(int[] arr) {
		int n = arr.length;
		if (n==0 || n==1)
            return n;
      
        // To store index of next unique element
        int j = 0;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i=0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];
      
        return j;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{1,1,1,2,2,3,5};
		int j = removeDuplicates2(a);
		
		for (int i = 0; i < j; i++) {
			System.out.println(a[i]);
		}
	}

	private static int removeDuplicates2(int[] src) {
		if (src == null) {
			throw new IllegalArgumentException("The input is invalid.");
		}
		if (src.length == 0 || src.length == 1) {
			return src.length;
		}

		int index = 0;

		for (int i = 0; i < src.length - 1; i++) {
			if (src[i] != src[i + 1]) {
				src[index++] = src[i];
			}
		}
		src[index++] = src[src.length - 1];
		return index;
	}

}
