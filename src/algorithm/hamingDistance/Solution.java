package algorithm.hamingDistance;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    private static int hammingDistance(int x, int y) {
        int distance = 0;
        // z & (z - 1) until the result can get 0 then it can get all none zero bits for z
        for (int z = x ^ y; z != 0; z = z & (z - 1)) {
            distance++;
        }
        return distance;
    }
}
