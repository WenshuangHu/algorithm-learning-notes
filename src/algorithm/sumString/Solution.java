package algorithm.sumString;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumString2("123", "123"));
    }

    private static String sumString2(String input1, String input2) {
        int carry = 0;
        StringBuilder finalStr = new StringBuilder();
        for (int i = input1.length() - 1, j = input2.length() - 1; i >= 0 || j >= 0; i--,j--) {
            int x = i < 0 ? 0 : input1.charAt(i) - '0';
            int y = j < 0 ? 0 : input2.charAt(j) - '0';
            finalStr.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return finalStr.reverse().toString();
    }

    private static String sumString(String input1, String input2) {
        int a = 0;
        StringBuilder finalStr = new StringBuilder();
        for (int i = input1.length() - 1, j = input2.length() - 1; i >= 0 || j >= 0; i--,j--) {
            int result = 0;
            if (i >= 0 && j >= 0) {
                result = input1.charAt(i) - '0' + input2.charAt(j) - '0' + a;
            } else if (i >= 0) {
                result = input1.charAt(i) - '0' + a;
            } else {
                result = input2.charAt(j) - '0' + a;
            }
            a = result / 10;
            finalStr.append(result % 10);
        }
        return finalStr.reverse().toString();
    }
}
