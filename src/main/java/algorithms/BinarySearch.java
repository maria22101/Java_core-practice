package algorithms;

import java.util.Arrays;

public class BinarySearch {

    static int[] bubbleSort(int[] a) {
        int i = a.length;
        while (i != 1) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    AlgorithmOperations.swap(a, j + 1, j);
                }
            }
            i--;
        }
        return a;
    }

    static void binarySearch(int[] a, int x, int from, int to) {
        int half = (from + to) / 2;

        if (x == a[half]) {
            System.out.println(x + " found at index #" + half);
            return;
        }
        if (from == to) {
            System.out.println(x + " not found in this array");
            return;
        }
        if (x < a[half]) {
            binarySearch(a, x, from, to - 1);
        } else {
            binarySearch(a, x, from + 1, to);
        }
    }

    public static void main(String[] args) {
        int[] a = AlgorithmOperations.generateArray(0, 30, 20);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(bubbleSort(a)));

        int from = 0;
        int to = a.length;
        binarySearch(a, 18, from, to);
    }
}
