package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] data) {
        if (data.length == 1) {
            return;
        }
        int leftSize = data.length / 2;
        int rightSize = data.length - leftSize;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        System.arraycopy(data, 0, left, 0, leftSize);
        System.arraycopy(data, leftSize, right, 0, rightSize);
        mergeSort(left);
        mergeSort(right);
        merge(data, left, right);
    }

    private static void merge(int[] data, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int targetIndex = 0;
        int remaining = left.length + right.length;
        while (remaining > 0) {
            if (leftIndex >= left.length) {
                data[targetIndex] = right[rightIndex++];
            } else if (rightIndex >= right.length) {
                data[targetIndex] = left[leftIndex++];
            } else if (right[rightIndex] < left[leftIndex]) {
                data[targetIndex] = right[rightIndex++];
            } else data[targetIndex] = left[leftIndex++];
            targetIndex++;
            remaining--;
        }
    }

    public static void main(String[] args) {
        int[] a = AlgorithmOperations.generateArray(0, 50, 10);
        System.out.println(Arrays.toString(a));
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }
}
