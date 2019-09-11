package algorithms;

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
}
