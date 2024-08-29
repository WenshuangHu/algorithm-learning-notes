package algorithm.primitivetypes;

public class CountTheNumber {

	public static short countBits(int x) {
		short numBits = 0;
		while (x != 0) {
			numBits += (x & 1) ;
			x >>>= 1;
		}
		return numBits;
	}
	
	public static void main(String[] args) {
		System.out.println(CountTheNumber.countBits(7));
		System.out.println(3 & 1);
		System.out.println(2 & 1);
		System.out.println(3 >>> 1);
	}
}
