package arrays;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double biteElems = 0;

        while (Math.pow(2, biteElems) < num) {
            biteElems++;
        }

        int[] arr = new int[(int) biteElems];
        int powOftwo = (int) biteElems - 1;
        int num2 = num;
        for (int i = 0; i < arr.length; i++) {
            if (num2 > 1) {
                arr[i] = 1;
            }
            num2 = num2 - (int)Math.pow(2, powOftwo);
            powOftwo--;
        }

        if (num % 2 == 1){
            arr[arr.length - 1] = 1;
        }

        for (int el : arr){
            System.out.print(el);
        }

    }
}
