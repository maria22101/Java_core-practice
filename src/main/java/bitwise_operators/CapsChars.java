package bitwise_operators;

public class CapsChars { //display Caps chars of the Alphabet next to the corresponding lowercases using bitwise &.
    //Unicode/ASCII: lowercase letters' value is greater than the corresponding uppercase by 32.
    //32 in binary is 0010 0000 => to transform lowercases to uppercases means to "turn off" the 6th bit =>
    //apply bitwise AND operation and the operand 1101 1111
    public static void main(String[] args) {
        char chr;
        for (int i = 0; i < 26 ; i++) {
            chr = (char) ('a' + i);
            System.out.print(chr);
            chr = (char) ((int) chr & 65503); //65503 is 1111 1111 1101 1111 - the 6th bit is turn off
            System.out.print(chr + " ");
        }
    }
}
