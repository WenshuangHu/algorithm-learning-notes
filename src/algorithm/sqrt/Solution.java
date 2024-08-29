package algorithm.sqrt;

public class Solution {
    public static void main(String[] args) {
        System.out.println(binarySearch(25));
    }

    private static int binarySearch(int x) {
        int l = 0, h = x;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int target = mid * mid;
            if (target == x) {
                return mid;
            } else if (target < x) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}
