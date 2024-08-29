package algorithm.countPrime;

public class Solution {
    public static void main(String[] args) {
        System.out.println(count(100));
    }

    private static int count(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
