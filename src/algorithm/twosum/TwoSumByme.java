package algorithm.twosum;
/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	You may assume that each input would have exactly one solution, and you may not use the same element twice.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 * @author wehu
 *
 */
public class TwoSumByme {

	public static void main(String[] args) {
		TwoSumByme t = new TwoSumByme();
		int[] result = t.twoSum(new int[]{2, 3, 4}, 6);
		System.out.println(result[0] + " " + result[1]);
	}
		
	public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) 
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        throw new IllegalArgumentException("No two sum solution");
    }
}
