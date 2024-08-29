package algorithm.longestcommonprefix;

public class Divideandconquer {
	
	private String longest(String[] str) {
		if (str == null || str.length == 0) 
			return "";
		
		return longest(str, 0, str.length - 1);
	}

	private String longest(String[] str, int i, int j) {
		if (i == j)
			return str[i];
		int mid = (i + j) / 2;
		String left = longest(str, i, mid);
		String right = longest(str, mid + 1, j);
		return prefix(left, right);
	}

	private String prefix(String left, String right) {
		int min = Math.min(left.length(), right.length());
		for (int i = 0; i < min; i++) {
			if (left.charAt(i) != right.charAt(i)){
				return left.substring(0, i);
			}
		}
		return left.substring(0, min);
	}
	
	public static void main(String[] args) {
		String[] test = new String[]{"235", "2346", "4689", "4687"};
		
		Divideandconquer divideandconquer = new Divideandconquer();
		
		System.out.println(divideandconquer.longest(test));
	}
}
