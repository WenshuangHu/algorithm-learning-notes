package algorithm.reverseinteger;

import java.util.Stack;

public class ReverseInteger1 {
	public static void main(String[] args) {
		ReverseInteger1 res = new ReverseInteger1();
		System.out.println(res.reverse(-2345));
		
		System.out.println(34 / 10);
		
		System.out.println(-34 / 10);
	}
	public int reverse(int x) {
		boolean isNagetive = false;		
		if (x < 0) {
			isNagetive = true;
			x = 0 - x;
		}
	
		int res = 0;
		int p = x;
		while(p > 0) {
			int mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
		
		if (isNagetive) 
			res = 0 - res;
		
		return res;
	}

}
