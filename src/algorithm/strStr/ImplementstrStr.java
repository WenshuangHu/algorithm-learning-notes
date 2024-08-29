package algorithm.strStr;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		if (haystack.contains(needle)) {
			return haystack.indexOf(needle);
		}	
        return -1;  
    }
	
	public static void main(String[] args) {
		ImplementstrStr strStr = new ImplementstrStr();
		
		System.out.println(strStr.strStr("aaabbbcccdf", "cd"));
	}
}
