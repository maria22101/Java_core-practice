package arrays;

import java.util.Arrays;

public class ArrayRandomInts {

    static int[] generateArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 201) - 100; //generating ints from -100 to 100 and assigning them to the item
        }
        return arr;
    }

    static int[] composeDividerArray(int[] arr, int divider) {
        int counter = 0;
        for (int elem : arr) {
            if (elem % divider == 0) {
                counter++;
            }
        }
        int[] divArr = new int[counter];

        counter = 0;
        for (int elem : arr) {
            if (elem % divider == 0) {
                divArr[counter++] = elem;
            }
        }
        return divArr;
    }

    public static void main(String[] args) {
        int[] myArr = generateArray(20);
        System.out.println(Arrays.toString(myArr));

        int[] myDivArr = composeDividerArray(myArr, 5);
        System.out.println(Arrays.toString(myDivArr));
    }
}
