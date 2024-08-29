package algorithm.stringsbootcamp;

public class InterConversion {
	public static String intToString (int x) {
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
		}
		StringBuilder s = new StringBuilder () ;
		do {
			s.append ((char)('0' + Math.abs(x % 10)));
			x /= 10;
		} while (x != 0);
		if (isNegative) {
			s.append('-') ; // Adds the negative sign back .
			s.reverse () ;
		}
		return s.toString ();
	}
	public static int stringToInt(String s) {
		int result = 0;
		for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); ++i) {
			final int digit = s.charAt(i) - '0';
			result = result * 10 + digit;
		}
		
		return s.charAt(0) == '-' ? -result : result;
	}
	
	public static void main(String[] args) {
		System.out.println(1234 % 10);
		System.out.println('0' + 1234 % 10);
		System.out.println(1 / 10);
		System.out.println(1234 / 10);
		System.out.println(intToString(1234));
		
		System.out.println(stringToInt("234"));
		
		System.out.println((int)'1');
		System.out.println((int)'0');
	}
}
