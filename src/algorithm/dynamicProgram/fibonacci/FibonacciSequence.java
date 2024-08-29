package algorithm.dynamicProgram.fibonacci;

//Fibonacci dynamic formula: f(n） = f(n - 1) + f(n - 2)
public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println(dpImpl(10));
        System.out.println(loopImpl(10));
    }

    private static int dpImpl(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    private static int loopImpl(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int preVal = 0;
        int curVal = 1;
        for (int i = 2; i <= n; i++) {
            int nextVal = curVal + preVal;
            preVal = curVal;
            curVal = nextVal;
        }
        return curVal;
    }
}
