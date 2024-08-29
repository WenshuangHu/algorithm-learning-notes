package algorithm.convertString;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }

    private static String reverse(String target) {
        if (target.isEmpty()) {
            throw new IllegalArgumentException("target cannot be empty.");
        }

        StringBuilder result = new StringBuilder();
        for (int i = target.length() - 1; i >= 0; i--){
            result.append(target.charAt(i));
        }
        return result.toString();
    }
}
