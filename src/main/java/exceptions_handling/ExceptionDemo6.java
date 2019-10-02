package exceptions_handling;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        int[] num = {14, 22, 50, 40, 8, 10, 15};
        int[] denom = {7, 11, 0, 7, 3};

        for (int i = 0; i < num.length; i++) {
            try {
                if (num[i] % denom[i] != 0){
                    throw new Not_Int_Result_CustomizedException(num[i], denom[i]);
                }
                System.out.println(num[i] + " / " + denom[i] + " = " + num[i] / denom[i]);
            }
            catch (ArithmeticException ar){
                System.out.println("Can not divide by zero");
            }
            catch (ArrayIndexOutOfBoundsException indx){
                System.out.println("Array index out of bounds");
            }
            catch (Not_Int_Result_CustomizedException customizedException){
                System.out.println(customizedException);
            }
        }
    }
}
