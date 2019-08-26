package arrays;

import java.util.Arrays;

public class ArrayAutoResizableStorage {
    private final static int DEFAULT_SIZE = 4;
    private final double K = 1.5;

    private int[] storage;
    private int index;

    private static int[] convert(String origin) {
        String[] s = origin.split(" ");
        int[] ints = new int[s.length];
        int index = 0;
        for (String str : s){
            ints[index++] = Integer.parseInt(str);
        }
        return ints;
    }

    public ArrayAutoResizableStorage(String init){
        this(convert(init));
    }

    public ArrayAutoResizableStorage(int[] arr) {
        this(arr.length);
        for (int i : arr) {
            push(i);
        }
        index = arr.length;
    }

    public ArrayAutoResizableStorage() {
        this(DEFAULT_SIZE);
    }

    public ArrayAutoResizableStorage(int size) {
        storage = new int[size];
        index = 0;
    }

    private void resize() {
        int newLength = (int) (storage.length * K);
        int[] newStorage = new int[newLength];
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        storage = newStorage;
    }

    private void push(int item) {
        if (index >= storage.length) {
            resize();
        }
        storage[index++] = item;
    }

    int[] get() {
        int[] result = new int[index];
        System.arraycopy(storage, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        ArrayAutoResizableStorage arr1 = new ArrayAutoResizableStorage(6);
        arr1.push(3);
        arr1.push(6);
        arr1.push(9);
        System.out.println(Arrays.toString(arr1.get()));

        int[] ar = {2, 12, 22, 32, 42, 52, 62, 72, 82, 92, 102};
        ArrayAutoResizableStorage arr2 = new ArrayAutoResizableStorage(ar);
        System.out.println(Arrays.toString(arr2.get()));
        arr2.push(222);
        arr2.push(2222);
        System.out.println(Arrays.toString(arr2.get()));

        String s = "234 89 344 55 888";
        ArrayAutoResizableStorage arr3 = new ArrayAutoResizableStorage(s);
        System.out.println(Arrays.toString(arr3.get()));
        arr3.push(8888);
        arr3.push(55555);
        System.out.println(Arrays.toString(arr3.get()));
    }

}
