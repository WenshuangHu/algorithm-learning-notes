package algorithm.palindromenumber;

import java.math.BigDecimal;

import algorithm.reverseinteger.ReverseInteger2;

public class PalindromeNumber {
	public boolean IsPalindrome(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0))
			return false;
		
		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x = x / 10;
		}
		
		return x == revertedNumber || x == revertedNumber / 10;
	}
	
	public static void main(String[] args) {
		PalindromeNumber pa = new PalindromeNumber();
		//System.out.println(pa.IsPalindrome(23432));
		System.out.println(reverseNum(12321));
	}

	private static int reverseNum(int input) {
		int reversedNum = 0;
		while (input > 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}
		return reversedNum;
	}

}
