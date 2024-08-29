package algorithm.interpreter;

import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    int ptr;

    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        ptr = 0;

        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {
                String digits = getDigits(s);
                stack.push(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                stack.push(String.valueOf(s.charAt(ptr++)));
            } else {
                ++ptr;
                Stack<String> subStack = new Stack<>();
                while(!"[".equals(stack.peek())) {
                    subStack.push(stack.pop());
                }
                stack.pop();
                int repeatTime = Integer.parseInt(stack.pop());
                StringBuilder sb = new StringBuilder();
                String str = getString(subStack);
                while (repeatTime-- > 0) {
                    sb.append(str);
                }
                stack.push(sb.toString());
            }
        }
        return getString(stack);
    }

    private String getString(Stack<String> subStack) {
        StringBuilder sb = new StringBuilder();
        while(!subStack.isEmpty()) {
            sb.append(subStack.pop());
        }
        return sb.toString();
    }

    private String getDigits(String s) {
        StringBuilder sb = new StringBuilder();
        while(Character.isDigit(s.charAt(ptr))) {
            sb.append(s.charAt(ptr++));
        }
        return sb.toString();
    }
}
