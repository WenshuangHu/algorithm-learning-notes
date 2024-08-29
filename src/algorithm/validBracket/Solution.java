package algorithm.validBracket;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String input = "{[]}";
        System.out.println(isValid(input));
    }

    private static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(') {
                stack.push(')');
            } else if (input.charAt(i) == '{') {
                stack.push('}');
            } else if (input.charAt(i) == '[') {
                stack.push(']');
            } else if (stack.peek() == input.charAt(i)) {
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
