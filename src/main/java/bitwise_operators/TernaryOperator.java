package bitwise_operators;

public class TernaryOperator {
    public static void main(String[] args) {

        int result;

        for (int i = -4; i < 5 ; i++) {
            if (i != 0 ? true : false) {
                result = 100 / i;
                System.out.println(100 + " / " + i + " = " + result);
            }
        }
    }
}
