package algorithm.removeduplicatesfromsortedarray;

public class RemoveDuplicates {
	
	public int removeDuplicates(int[] nums) {
	    if (nums == null)
	    	throw new IllegalArgumentException();
	    if (nums.length <= 1)
	    	return nums.length;
		int count = 0;
	    for (int i = 0; i < nums.length - 1; i++) 
	    	for (int j = i + 1; j < nums.length; j++) {
	    		if (nums[i] == nums[j])
	    			count++;
	    	}
	    return nums.length - count;
    }

	public static void main(String[] args) {
		int[] a = new int[]{1, 1, 3, 3, 4, 5};
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		System.out.println(removeDuplicates.removeDuplicates(a));
	}

}
