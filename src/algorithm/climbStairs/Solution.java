package algorithm.climbStairs;

public class Solution {
    public static void main(String[] args) {
        System.out.println(climbStairsRecursion(40));
        System.out.println(climbStairsLoop(40));
    }

    private static int climbStairsRecursion(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
    }

    private static int climbStairsLoop(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int prePre = 1;
        int pre = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }
}
