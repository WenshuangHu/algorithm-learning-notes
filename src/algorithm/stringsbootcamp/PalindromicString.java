package algorithm.stringsbootcamp;

public class PalindromicString {
	
	private static boolean isPalindromic(String str) {
		if (str == null) {
			throw new IllegalArgumentException();
		}
		if (str.length() <= 1)
			return true;
		
		for (int i = 0, j = str.length() - 1;  i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abcddcba";
		System.out.println(PalindromicString.isPalindromic(str));
	}
}
