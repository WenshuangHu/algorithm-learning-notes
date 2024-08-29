package algorithm.dynamicProgram.maxStock;

//求出卖出股票最佳阶段，并返回最大利润
public class SellStock {
    public static void main(String[] args) {
        int[] inputs = new int[] {8, 2, 10, 3, 6, 3, 12};
        System.out.println(maxProfit(inputs));
        SellStock s1 = new SellStock();
        SellStock s2 = new SellStock();
        System.out.println(s1 == s2);
    }

    private static int maxProfit(int[] input) {
        int lowestPrice = input[0];
        int maxProfit = -input[0];
        for (int i = 1; i < input.length; i++) {
            if (maxProfit < (input[i] - lowestPrice)) {
                maxProfit = input[i] - lowestPrice;
            }
            if(lowestPrice > input[i]) {
                lowestPrice = input[i];
            }
        }
        return maxProfit;
    }
}
