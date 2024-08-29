package algorithm.addTwoStrings;


public class Solution {
    public static void main(String[] args) {
        String s1 = "1245";
        String s2 = "327";

        System.out.println(add(s1, s2));
    }

    public static String add(String s1, String s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            throw new IllegalArgumentException("Argument is invalid.");
        }
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = s1.length() - 1, j = s2.length() - 1; i >= 0 || j >=0; i--, j--) {
            int x = i < 0 ? 0 : s1.charAt(i) - '0';
            int y = j < 0 ? 0 : s2.charAt(j) - '0';
            int z = (x + y + carry) % 10;
            carry = (x + y) / 10;
            result.append(z);
        }
        return result.reverse().toString();
    }
}
