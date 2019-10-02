package exceptions_handling;

public class ExceptionDemo2 {

    static void generateException(){
        int[] arr = new int[5];
        System.out.println("Before exception generating");
        arr[6] = 1;
        System.out.println("This will not be displayed");
    }

    public static void main(String[] args) {
        try {
            generateException();
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Out of bounds exception!");
        }
        System.out.println("After exceptions processing");
    }
}
