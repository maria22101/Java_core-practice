package bitwise_operators;

public class DecimalToBinary {
    int bitesReflected;
    int mask;

    DecimalToBinary(int bitesReflected) {
        this.bitesReflected = bitesReflected;
        mask = 1;
    }

    void showBites(int num) {

        mask <<= bitesReflected - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((mask & num) == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            spacer++;
            if (spacer % 8 == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DecimalToBinary d1 = new DecimalToBinary(8);
        DecimalToBinary d2 = new DecimalToBinary(16);
        DecimalToBinary d3 = new DecimalToBinary(32);
        d1.showBites(123); //reflects 123 in binary displaying 8 bits
        d2.showBites(65503); //reflects 65503 in binary displaying 16 bits
        d3.showBites(87986); //reflects 87986 in binary displaying 32 bits
    }
}
