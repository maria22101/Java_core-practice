package algorithms;

public class QuickSort {
    private static int counter_check = 0;
    private static int counter_permutation = 0;

    private static void doSort(int[] data, int startIndex, int endIndex) {
        int maxIndex = startIndex;
        int runningIndex  = startIndex;
        boolean swapped = false;

        while (runningIndex < endIndex) {
            if (data[runningIndex] <= data[endIndex]) {
                if (maxIndex == runningIndex) {
                    maxIndex++;
                } else {
                    AlgorithmOperations.swap(data, maxIndex, runningIndex);
                    swapped = true;
                    maxIndex++;
                    counter_permutation++;
                }
            }
            runningIndex++;
            counter_check++;
        }
        if (data[maxIndex] > data[endIndex]) {
            AlgorithmOperations.swap(data, maxIndex, endIndex);
            swapped = true;
            counter_permutation++;
        }
        if ((maxIndex > startIndex && swapped) || (maxIndex > startIndex && maxIndex == runningIndex) ) {
            System.out.println("We are sorting 1st half...");
            doSort(data, startIndex, maxIndex - 1);
        }
        if (maxIndex < endIndex && swapped) {
            System.out.println("We are sorting 2nd half...");
            doSort(data, maxIndex + 1, runningIndex);
        }
    }

    public static void main(String[] args) {
        int[] arr = AlgorithmOperations.generateArray(0, 30, 20);
        AlgorithmOperations.printArray("Original array: ", arr);

        int from = 0;
        int to = arr.length - 1;
        QuickSort.doSort(arr, from, to);
        AlgorithmOperations.printArray("Sorted array: ", arr);
        System.out.printf("Array sorted by %d checks and %d permutations", counter_check, counter_permutation);
    }
}
