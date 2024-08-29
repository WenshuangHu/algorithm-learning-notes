package algorithm.dynamicProgram.maxSortSequence;

public class CalculateMaxSub {

    public static void main(String[] args) {
        int[] srcInput = new int[] {1, -1, 2, -4, -5, -1, 4, -2, 3};
        //System.out.println(calculateMaxSubSequenceVal(srcInput));
        System.out.println(calculate(srcInput));
    }

    private static int calculate(int[] srcValues) {
        int preMaxVal = srcValues[0];
        int maxVal = srcValues[0];
        for (int i = 1; i < srcValues.length; i++) {
            preMaxVal = Math.max(srcValues[i] + preMaxVal, srcValues[i]);
            if(preMaxVal > maxVal) {
                maxVal = preMaxVal;
            }
        }
        return maxVal;
    }

    private static int calculateMaxSubSequenceVal(int[] srcValues) {
        int[] dpSubSum = new int[srcValues.length];
        dpSubSum[0] = srcValues[0];
        int maxVal = srcValues[0];
        for (int i = 1; i < srcValues.length; i++) {
            dpSubSum[i] = Math.max(srcValues[i] + dpSubSum[i - 1], srcValues[i]);
            maxVal = dpSubSum[i];
        }
        return maxVal;
    }


}
