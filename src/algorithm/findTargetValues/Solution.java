package algorithm.findTargetValues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] inputs = new int[]{1, 3, 4, 5, 6, 9};
        System.out.println(Arrays.toString(find(inputs, 8)));
        System.out.println(Arrays.toString(findByBinary(inputs, 8)));
        System.out.println(Arrays.toString(twoPoints(inputs, 8)));
    }

    private static int[] find(int[] inputs, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < inputs.length; i++) {
            if (tempMap.get(inputs[i]) != null) {
                return new int[]{tempMap.get(inputs[i]), i};
            }
            int remainingVal = target - inputs[i];
            tempMap.put(remainingVal, i);
        }
        return null;
    }

    private static int[] findByBinary(int[] inputs, int target) {
        for (int i = 0; i < inputs.length; i++) {
            int low = i, high = inputs.length - 1;
            while (low <= high) {
                int middle = low + (high - low) / 2;
                int result = inputs[i] + inputs[middle];
                if (result == target) {
                    return new int[]{i, middle};
                } else if (result < target) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        return null;
    }

    private static int[] twoPoints(int[] inputs, int target) {
        int low = 0, high = inputs.length - 1;
        while(low < high) {
            int tempResult = inputs[low] + inputs[high];
            if (tempResult == target) {
                return new int[]{low, high};
            } else if (tempResult < target) {
                low++;
            } else {
                high--;
            }
        }
        return null;
    }
}
