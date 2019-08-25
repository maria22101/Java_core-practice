package arrays;

import java.util.Arrays;

public class CharArrayQuickSort { // using Recursion

    public static void quickSort(char charsArray[], int sortFrom, int sortTo) {
        int i = sortFrom;
        int j = sortTo;
        char x = charsArray[(i + j) / 2];
        char y;

        do {
            while (charsArray[i] < x && i < sortTo) i++;
            while (x < charsArray[j] && j > sortFrom) j--;
            if (i <= j) {
                y = charsArray[i];
                charsArray[i] = charsArray[j];
                charsArray[j] = y;
                i++; j--;
            }
        } while (i <= j);

        if (sortFrom < j) quickSort(charsArray, sortFrom, j);
        if (i < sortTo) quickSort(charsArray, i, sortTo);
    }

    public static void main(String[] args) {
        char[] ch = {'j', 'q', 'a', 'y', 'p', 'm', 'c', 'e'};
        System.out.println("Original array: " + Arrays.toString(ch));
        CharArrayQuickSort.quickSort(ch, 0, ch.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(ch));
    }
}
