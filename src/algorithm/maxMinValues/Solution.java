package algorithm.maxMinValues;

public class Solution {
    public static void main(String[] args) {
        int[] inputs = new int[]{3, 4, 5, 9, 1, 3, 4, 2, -10, -20};
        System.out.println("The final max value: " + getMaxValue(inputs));
    }

    private static int getMaxValue(int[] inputs) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int i : inputs) {
            if (i < min1) {
                min2 = min1;
                min1 = i;
            } else if (i < min2) {
                min2 = i;
            }
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3) {
                max3 = i;
            }
        }
        System.out.println("min1: " + min1 + " min2: " + min2);
        System.out.println("max1: " + max1 + " max2: " + max2 + " max3: " + max3);
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
