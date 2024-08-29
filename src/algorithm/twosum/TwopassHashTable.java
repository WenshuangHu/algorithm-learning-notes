package algorithm.twosum;

import java.util.HashMap;

public class TwopassHashTable {
	HashMap<Integer, Integer> map = new HashMap<>();
	public int[] twoSum(int[] nums, int target) {        
        for (int j = 0; j < nums.length; j++) {
        	int i = target - nums[j];
        	if (map.containsKey(i)) {
        		return new int[] {map.get(i), j};
        	}
        	map.put(nums[j], j);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	public static void main(String[] args) {
		TwoSumByme t = new TwoSumByme();
		int[] result = findIndexes(new int[]{2, 3, 4}, 6);
		System.out.println(result[0] + " " + result[1]);
	}

	private static int[] findIndexes(int[] src, int target) {
		int[] result = new int[2];
		for(int i = 0; i < src.length - 1; i++)
			for(int j = i + 1; j < src.length; j++) {
				if((src[i] + src[j]) == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		return result;
	}
}
