package algorithms;

public class QuickSort2 {
    public static void quickSort(int arr[], int sortFrom, int sortTo) {
        int i = sortFrom;
        int j = sortTo;
        int x = arr[(i + j) / 2];
        int y;

        do {
            while (arr[i] < x && i < sortTo) i++;
            while (x < arr[j] && j > sortFrom) j--;
            if (i <= j) {
                y = arr[i];
                arr[i] = arr[j];
                arr[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if (sortFrom < j) quickSort(arr, sortFrom, j);
        if (i < sortTo) quickSort(arr, i, sortTo);
    }

    public static void main(String[] args) {
        int[] arr = AlgorithmOperations.generateArray(0, 80, 15);
        AlgorithmOperations.printArray("Original array: ", arr);
        quickSort(arr, 0, arr.length - 1);
        AlgorithmOperations.printArray("Sotrted array: ", arr);
    }
}
