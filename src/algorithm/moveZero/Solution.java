package algorithm.moveZero;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] target = new int[] {2, 0, 0, 0, 8, 9};
        //System.out.println(Arrays.toString(moveZero(target)));
        System.out.println(Arrays.toString(moveZero2(target)));
    }

    public static int[] moveZero2(int[] nums) {
        for(int i = 0, j = 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            }
            if (nums[j] != 0 && nums[i] == 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
        return nums;
    }











    public static int[] moveZero(int[] target) {
        for (int i = 0, j = 0; j < target.length; j++) {
            if(target[i] == 0 && target[j] != 0) {
                target[i] = target[j];
                target[j] = 0;
                i++;
            } else if (target[i] != 0) {
                i++;
            }
        }
        return target;
    }
}
