package algorithm.findAllMissingNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] target = new int[] {1, 2, 4, 5, 8, 6, 6, 5};
        //System.out.println(Arrays.toString(find2(target)));
        System.out.println(find3(target));
    }

    public static List<Integer> find3(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static int[] find2(int[] target) {
        for(int i = 0; i < target.length; i++) {
            if (target[i] < 0 && target[-target[i] - 1] > 0) {
                target[-target[i] - 1] = -target[-target[i] - 1];
            } else if (target[i] > 0 && target[target[i] - 1] > 0) {
                target[target[i] - 1] = -target[target[i] - 1];
            }
        }
        return target;
    }

    public static int[] find(int[] target) {
        int[] tmp = new int[target.length];
        for (int i = 0; i < target.length; i++) {
            tmp[target[i] - 1] = 1;
        }
        int index = 0;
        for (int j = 0; j < tmp.length; j++) {
            if(tmp[index] == 1 && tmp[j] == 0) {
                tmp[index] = j + 1;
                tmp[j] = 1;
                index++;
            } else if (tmp[index] == 0) {
                tmp[index] = ++index;
            }
        }
        return Arrays.copyOfRange(tmp, 0, index);
    }
}
