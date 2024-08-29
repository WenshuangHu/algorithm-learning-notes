package algorithm.deleteDuplicateArrayElements;

public class Solution {
    public static void main(String[] args) {
        int[] inputs = new int[]{1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(removeDuplicates(inputs));
    }

    private static int removeDuplicates(int[] inputs) {
        if(inputs == null) {
            throw new IllegalArgumentException("Inputs cannot be empty.");
        }
        if(inputs.length <= 1) {
            return inputs.length;
        }
        int newIndex = 0;
        for(int i = 1; i < inputs.length; i++) {
            if (inputs[newIndex] != inputs[i]) {
                newIndex++;
                inputs[newIndex] = inputs[i];
            }
        }
        return newIndex;
    }
}
