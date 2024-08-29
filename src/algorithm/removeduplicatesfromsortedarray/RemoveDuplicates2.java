package algorithm.removeduplicatesfromsortedarray;

public class RemoveDuplicates2 {
	
	/**
	 * Time complextiy : O(n)O(n). Assume that nn is the length of array. Each of ii and jj traverses at most nn steps.
	 * Space complexity : O(1)O(1).
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
    }

	public static void main(String[] args) {
		int[] a = new int[]{1, 1, 3, 3, 4, 5};
		RemoveDuplicates2 removeDuplicates = new RemoveDuplicates2();
		System.out.println(removeDuplicates.removeDuplicates(a));
	}

}
