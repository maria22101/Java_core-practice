package algorithms;

public class MergeSort_2 {
    private static int counter_check = 0;
    private static int counter_permutation = 0;


    void merge(int[] arr, int l_index, int mid_index, int r_index) {
        int size_l = mid_index - l_index + 1;
        int size_r = r_index - mid_index;

        int[] left = new int[size_l]; // Create two arrays
        int[] right = new int[size_r];

        for (int i = 0; i < size_l; i++) { // Fill in the arrays with the source array elements
            left[i] = arr[l_index + i];
            counter_check++;
        }

        for (int i = 0; i < size_r; i++) {
            right[i] = arr[mid_index + 1 + i];
            counter_check++;
        }

        int i = 0, j = 0; // Merge
        int k = l_index; // Initial index of the merged subarray
        while (i < size_l && j < size_r) { //Fill in the resulting merged array with the sorted elements of the two arrays
            if (left[i] < right[j]) {
                arr[k] = left[i++];
            } else {
                arr[k] = right[j++];
            }
            k++;
            counter_permutation++;
        }

        while (i < size_l){ // Add to the resulting merged array the "odd" (remaining) elements of either the first or the second array
            arr[k++] = left[i++];
        }

        while (j < size_r){
            arr[k++] = right[j++];
        }
    }

    void sort(int[] arr, int l, int r){
        if (l < r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int[] data = AlgorithmOperations.generateArrayWithStream(6);
        AlgorithmOperations.printArray("Source array: ", data);

        MergeSort_2 ms = new MergeSort_2();
        ms.sort(data, 0, data.length - 1);

        AlgorithmOperations.printArray("Sorted array: ", data);
        System.out.printf("Checks count: %d\nPermutations count: %d\n", counter_check, counter_permutation);
    }
}
