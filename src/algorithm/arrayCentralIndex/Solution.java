package algorithm.arrayCentralIndex;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] inputs = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(findCentralIndex(inputs));
    }

    private static int findCentralIndex(int[] inputs) {
        int sum = Arrays.stream(inputs).sum();
        int partialSum = 0;
        for(int i = 0; i < inputs.length; i++) {
            partialSum += inputs[i];
            if (partialSum == sum) {
                return i;
            }
            sum -= inputs[i];
        }
        return -1;
    }
}
