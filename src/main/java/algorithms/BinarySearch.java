package algorithms;

import java.util.Arrays;

public class BinarySearch {

    static int[] bubbleSort(int[] a){
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

    static void binarSearch(int[] a, int x){
        int len = a.length / 2;
        boolean found = false;

        while (!found && len != 1){

            for (int i = 0; i < a[len]; i++) {
                if (a[i] == x){
                    found = true;
                }
            }

            if (!found){
                for (int i = a[a.length - len]; i < a.length; i++) {
                    if (a[i] == x){
                        found = true;
                    }
                }
            }

         }
    }

    public static void main(String[] args) {
        int[] a = AlgorithmOperations.generateArray(0, 60, 20);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(bubbleSort(a)));


    }
}
