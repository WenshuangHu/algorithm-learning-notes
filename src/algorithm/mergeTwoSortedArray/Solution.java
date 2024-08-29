package algorithm.mergeTwoSortedArray;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] a = new int[] {1, 3, 4, 5, 9, 0, 0, 0, 0, 0};
        int[] b = new int[] {2, 3, 7, 9, 10};
        //merge1(a, b);
        merge2(a, b);
    }

    public static void merge2(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both parameters cannot be empty.");
        }
        int aTail = a.length - b.length - 1;
        int bTail = b.length - 1;
        for (int i = a.length - 1; i >= 0 && aTail >= 0 && bTail >= 0; i--) {
            if (a[aTail] >= b[bTail]) {
                a[i] = a[aTail];
                aTail--;
            } else {
                a[i] = b[bTail];
                bTail--;
            }
        }

        System.out.println(Arrays.toString(a));
    }

    public static void merge1(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both parameters cannot be empty.");
        }
        int j = 0;
        for (int i = b.length; i < a.length; i++ ) {
            a[i] = b[j];
            j++;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }


}
