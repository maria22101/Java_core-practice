package algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = AlgorithmOperations.generateArray(0, 51, 10);
        System.out.println(Arrays.toString(a));

        int i = a.length;
        while (i != 1) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    AlgorithmOperations.swap(a, j + 1, j);
                }
            }
            i--;
        }

        System.out.println(Arrays.toString(a));
    }

}
