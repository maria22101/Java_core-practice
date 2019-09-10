package algorithms;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] arr, int index_1, int index_2){
            int temp = arr[index_1];
            arr[index_1] = arr[index_2];
            arr[index_2] = temp;
    }

    static int[] generateArray(int from, int to, int length){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = from + (int) (Math.random() * (to - from + 1));
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] data = generateArray(1, 50, 10);

        System.out.println(Arrays.toString(data));

        int min;
        int minIndex;

        for (int i = 0; i < data.length - 1; i++) {
            min = data[i];
            minIndex = 0;
            for (int j = i + 1; j < data.length ; j++) {
                if (data[j] < min){
                    min = data[j];
                    minIndex = j;
                }
            }
            if (minIndex > 0) {
                swap(data, minIndex, i);
            }
        }

        System.out.println(Arrays.toString(data));
    }

}
