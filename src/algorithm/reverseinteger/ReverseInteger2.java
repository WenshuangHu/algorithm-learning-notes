package algorithm.reverseinteger;

public class ReverseInteger2 {
	
	public int reverse(int x) {
		int res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x = x / 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		ReverseInteger2 res = new ReverseInteger2();
		System.out.println(res.reverse(2345));
		
		System.out.println(34 / 10);
		
		System.out.println(-34 / 10);
		
		System.out.println(-3 / 10);
	}

}
