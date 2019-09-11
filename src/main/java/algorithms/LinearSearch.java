package algorithms;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = SelectionSort.generateArray(0, 12, 10);
        System.out.println(Arrays.toString(a));
        int toFind = (int) (Math.random() * 13);
        System.out.println(toFind);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == toFind) {
                System.out.println("The element is found and it is: " + a[i]);
                break;
            }
        }
    }
}
