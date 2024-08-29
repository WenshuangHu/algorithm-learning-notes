package algorithm.tentothree;

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToThree(1000));
        System.out.println(convertToTen(convertToThree(1000)));
        System.out.println(Integer.toString(1000, 3));
        System.out.println(Integer.parseInt("1101001", 3));
    }

    private static int convertToThree(int target) {
        int result = 0;
        int index = 1;
        while(target > 0) {
            int tmp = target % 3;
            target = target / 3;
            result = result + tmp * index;
            index = index * 10;
        }

        return result;
    }

    private static int convertToTen(int target) {
        int result = 0;
        int index = 1;
        while (target > 0) {
            int tmp = target % 10;
            target = target / 10;
            result = result + tmp * index;
            index = index * 3;
        }
        return result;
    }
}
