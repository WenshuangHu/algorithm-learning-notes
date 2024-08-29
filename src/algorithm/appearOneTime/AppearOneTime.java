package algorithm.appearOneTime;

public class AppearOneTime {

    public static void main(String[] args) {
        int[] inputs = new int[] {1, 1, 4, 5, 6, 4, 5};
        System.out.println(findOnlyOne(inputs));
    }
    
    private static int findOnlyOne(int[] inputs) {
        if (inputs == null || inputs.length == 0) {
            throw new IllegalArgumentException();
        }
        int result = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            result ^= inputs[i];
        }
        return result;
    }
}
