package arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] data1 = {2, 3, 4, 5, 6, 7, 8};
        int[] data2 = {2, 2, 2, 2, 2, 2, 2};
        int[] data3 = new int[10];

        for (int i = 0; i < data1.length; i++) { // copying data1 array to data2 array
            data2[i] = data1[i];
        }
        System.out.println(Arrays.toString(data2));

        System.arraycopy(data1, 3, data3, 1, 3); // copying 3 elements from data1 array (starting from pos_3) to data3 array (starting from pos_1)
        System.out.println(Arrays.toString(data3));

        System.arraycopy(data1, 0, data3, 8, 2);
        System.out.println(Arrays.toString(data3));

        System.arraycopy(data1, 0, data3, 0, data1.length);
        System.out.println(Arrays.toString(data3));
    }

}
