package algorithm.countBits;

import java.util.Arrays;

/**
 * input: n = 2, output: [0,1,1]
 * n = 5, output: [0,1,1,2,1,2]
 */
public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(50)));
    }

    private static int[] countBits2(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }

    private static int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {

            //i&1 求奇数 如果是奇数则是前一个偶数bit和加1，如果是偶数则是其/2的数据的bit和。
            result[i] = (i & 1) == 1 ? result[i - 1] + 1 : result[i >> 1];
        }
        return result;
    }
}
