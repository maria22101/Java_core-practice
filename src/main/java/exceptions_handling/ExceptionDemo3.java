package exceptions_handling;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int[] num = {14, 18, 12, 24, 35, 30};
        int[] denom = {2, 9, 4, 0, 7, 5};

        System.out.println("Program starts...");

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + denom[i] + " = " + num[i] / denom[i]);
            }catch (ArithmeticException ar){
                System.out.println("Can not divide by zero");
            }
        }
        System.out.println("...Program ends.");
    }
}
