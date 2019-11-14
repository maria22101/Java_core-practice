package arrays;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double biteElems = 0;

        while (Math.pow(2, biteElems) <= num) {
            biteElems++;
        }

        int[] arr = new int[(int) biteElems];
        int powOftwo = (int) biteElems - 1;
        int cumulative = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((cumulative + (int) Math.pow(2, powOftwo)) <= num) {
                arr[i] = 1;
                cumulative = cumulative + (int) Math.pow(2, powOftwo);
            }
            powOftwo--;
        }

        if (num % 2 != 0) {
            arr[arr.length - 1] = 1;
        }

        for (int el : arr) {
            System.out.print(el);
        }

    }
}
