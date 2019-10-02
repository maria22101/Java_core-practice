package exceptions_handling;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        try {
            System.out.println("Before exception generated");
            arr[10] = 2;
            System.out.println("After exception generated");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index invalid - out of bounds");
        }
        System.out.println("After exception processed");
    }
}
