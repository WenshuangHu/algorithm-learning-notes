package algorithm.validparentheses;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author wehu
 *
 */
public class validParentheses {
	private static Map<String, String> map = new HashMap<>();
	static {
		map.put("(", "()");
		map.put("{", "{}");
		map.put("[", "[]");
	}
	
	private boolean isValid(String str) {
		if (str == null || str.length() <= 1)
			return false;
		
		for(int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i)) && (i + 1) < str.length()) {
				if (!str.substring(i, i + 1).equals(map.get(i)))
						return false;
			}
		}
		
		return true;
	}
}
