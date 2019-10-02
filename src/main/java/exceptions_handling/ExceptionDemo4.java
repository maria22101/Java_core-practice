package exceptions_handling;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] num = {14, 18, 12, 24, 42, 15};
        int[] denom = {2, 0, 4, 0, 2};

        System.out.println("Program starts...");

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + denom[i] + " = " + num[i] / denom[i]);
            }catch (ArithmeticException ar){
                System.out.println("Can not divide by zero");
            }catch (IndexOutOfBoundsException indx){
                System.out.println("No matching element found in one of the arrays");
            }
        }
        System.out.println("...Program ends.");
    }

}
