package algorithm.osition;

public class SearchInsertPosition {
	
	/**
	 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

		You may assume no duplicates in the array.

		Here are few examples.
		[1,3,5,6], 5 → 2
		[1,3,5,6], 2 → 1
		[1,3,5,6], 7 → 4	
		[1,3,5,6], 0 → 0
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		
		if(nums==null)
	        return -1;
	    if(target>nums[nums.length-1]){
	        return nums.length;
	    }
        int i = 0;
        int j = nums.length;
        while (i < j) {
        	int mid = (i + j) / 2;
        	if (target > nums[mid]) {
        		i = mid + 1;
        	}else {
        		j = mid;
        	}      	
        }
        
        return j;
    }
	
	public static void main(String[] args) {
		int [] nums = new int[]{1,3,5,6};
		
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		System.out.println(searchInsertPosition.searchInsert(nums, 6));

		System.out.println(findIndex(nums, 6));

	}

	private static int findIndex(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= target)
				return i;
		}
		return Integer.MIN_VALUE;
	}

}
