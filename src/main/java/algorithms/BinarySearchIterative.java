package algorithms;

public class BinarySearchIterative {

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

    static void binarySearch(int[] a, int x) {
        int from = 0;
        int to = a.length - 1;
        while (from < to) {
            int half = (from + to) / 2;
            if (x == a[half]) {
                System.out.println(x + " found at index #" + half);
                return;
            }
            if (x < a[half]) {
                to = half-1;
            } else {
                from = half + 1;
            }
        }
        System.out.println(x + " not found in this array");
    }

    public static void main(String[] args) {
        int[] a = AlgorithmOperations.generateArrayWithStream(50);
        AlgorithmOperations.printArray("Original array: ", a);

        BinarySearchIterative.bubbleSort(a);
        AlgorithmOperations.printArray("Sorted array: ", a);

        BinarySearchIterative.binarySearch(a, 27);
    }
}
