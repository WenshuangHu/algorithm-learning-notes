package algorithm.longestcommonprefix;

public class LongestCommonPrefix1 {
	
	private String longest(String[] str) {
		if (str.length == 0)
			return "";
		String prefix = str[0];
		
		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		
		return prefix;
	}
	
	public static void main(String[] args) {
		String[] test = new String[]{"23", "234", "235", "235"};

		System.out.println("1234".indexOf("34"));
		
		LongestCommonPrefix1 longestCommonPrefix1 = new LongestCommonPrefix1();
		
		System.out.println(longestCommonPrefix1.longest(test));
	}

}
