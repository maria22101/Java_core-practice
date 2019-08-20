package bitwise_operators;

import java.util.Scanner;

public class BitsWithinByte {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer <= 128: ");
        num = scan.nextInt();

        //by dividing 128 by 2 we consequently go bite-by-bite within a byte, and reflect 1, if the bite to be reflected
        //in the binary form and 0 - if not:
        for (int i = 128; i > 0; i = i / 2) {
            if ((num & i) == 0)
                System.out.print("0 ");
            else System.out.print("1 ");
        }
    }
}
