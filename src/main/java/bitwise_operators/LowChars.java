package bitwise_operators;

public class LowChars {
    public static void main(String[] args) {
        char ch;
        for (int i = 0; i < 26 ; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32); //we are adding 32 (the 6th bit in the byte - 0010 0000)
            System.out.print(ch + " ");
        }
    }
}
