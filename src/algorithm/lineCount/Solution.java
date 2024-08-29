package algorithm.lineCount;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lines(10));
    }

    private static int lines(int n) {
        int lineNum = 0;
        int lineSum = 0;
        while(lineSum < n){
            lineNum++;
            lineSum += lineNum;
        }
        return lineSum == n ? lineNum : --lineNum;
    }
}
