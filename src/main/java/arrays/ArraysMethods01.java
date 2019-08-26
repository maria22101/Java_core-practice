package arrays;

import java.util.Arrays;

public class ArraysMethods01 {

    static int get_random(int from, int to) {
        double result = from + (to - from + 1) * Math.random();
        return (int) result;
    }

    static int[] createRandomArray(int from, int to, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = get_random(from, to);
        }
        return arr;
    }

    static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    static int[] arrayOfPositives(int[] arr){
        int[] pos = new int[countPositive(arr)];
        int indexPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                pos[indexPos++] = arr[i];
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(ArraysMethods01.get_random(5, 8));
        int[] a = createRandomArray(-5, 15, 6);
        System.out.printf("Initial array: %s\n", Arrays.toString(a));
        System.out.printf("Count of positive numbers: %d\n", ArraysMethods01.countPositive(a));
        System.out.println(Arrays.toString(ArraysMethods01.arrayOfPositives(a)));
    }
}
