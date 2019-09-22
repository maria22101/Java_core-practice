package algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class AlgorithmOperations {
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

    static int[] generateArrayWithStream(int length){
        Random r = new Random();
        return Stream.generate(() -> r.nextInt(100))
                .distinct()
                .limit(length)
                .mapToInt(i -> i)
                .toArray();
    }

    static void printArray(String message, int[] arr){
        System.out.printf("%s %s\n", message, Arrays.toString(arr));
    }
}
